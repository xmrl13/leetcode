package main

import (
	"encoding/json"
	"fmt"
	"io/ioutil"
	"log"
	"net/http"
	"sort"
)

type Country struct {
	Name       string `json:"name"`
	Region     string `json:"region"`
	Population int    `json:"population"`
}

type ApiResponse struct {
	Page       int       `json:"page"`
	PerPage    int       `json:"per_page"`
	Total      int       `json:"total"`
	TotalPages int       `json:"total_pages"`
	Data       []Country `json:"data"`
}

func FindCountry(region string, keyword string) []string {
	baseURL := "https://jsonmock.hackerrank.com/api/countries/search"
	page := 1
	var results []Country

	for {
		url := fmt.Sprintf("%s?region=%s&name=%s&page=%d", baseURL, region, keyword, page)

		resp, err := http.Get(url)
		if err != nil {
			log.Fatal(err)
		}
		defer resp.Body.Close()

		body, err := ioutil.ReadAll(resp.Body)
		if err != nil {
			log.Fatal(err)
		}

		var apiResp ApiResponse
		json.Unmarshal(body, &apiResp)

		results = append(results, apiResp.Data...)

		if page >= apiResp.TotalPages {
			break
		}
		page++
	}

	// Ordena por população e nome
	sort.Slice(results, func(i, j int) bool {
		if results[i].Population == results[j].Population {
			return results[i].Name < results[j].Name
		}
		return results[i].Population < results[j].Population
	})

	// Formata resultado
	var output []string
	for _, country := range results {
		output = append(output, fmt.Sprintf("%s,%d", country.Name, country.Population))
	}

	return output
}
