package main

import (
	"fmt"
	"strings"
)

func preprocessDate(dates []string) []string {
	mapa := map[string]string{
		"Jan": "01", "Feb": "02", "Mar": "03", "Apr": "04",
		"May": "05", "Jun": "06", "Jul": "07", "Aug": "08",
		"Sep": "09", "Oct": "10", "Nov": "11", "Dec": "12",
	}

	var result []string

	for _, date := range dates {
		parts := strings.Split(date, " ")
		// Remove "st", "nd", "rd", "th" do dia
		day := parts[0][:len(parts[0])-2]
		if len(day) == 1 {
			day = "0" + day
		}
		month := mapa[parts[1]]
		year := parts[2]
		formatted := fmt.Sprintf("%s-%s-%s", year, month, day)
		result = append(result, formatted)
	}

	return result
}
