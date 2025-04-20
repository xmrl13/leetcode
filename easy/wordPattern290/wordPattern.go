package main

import "fmt"

func main() {

	fmt.Println(wordPattern("abba", "dog cat cat dog"))
	fmt.Println(wordPattern("abba", "dog cat cat fish"))
	fmt.Println(wordPattern("aaaa", "dog cat cat dog"))
	fmt.Println(wordPattern("abba", "dog dog dog dog"))
}

func wordPattern(pattern string, s string) bool {

	sSlice := []string{}
	patternSlice := []string{}
	var palavra = ""

	for i := 0; i < len(s); i++ {

		if s[i] != ' ' {
			palavra += string(s[i])
		}
		if s[i] == ' ' || i == len(s)-1 {
			sSlice = append(sSlice, palavra)
			palavra = ""
		}
	}
	for i := 0; i < len(pattern); i++ {
		patternSlice = append(patternSlice, string(pattern[i]))
	}

	if len(patternSlice) != len(sSlice) {
		return false
	}

	mapa := make(map[string]string)

	for i := 0; i < len(patternSlice); i++ {
		if _, existe := mapa[patternSlice[i]]; !existe {
			for _, v := range mapa {
				if v == sSlice[i] {
					return false
				}
			}
			mapa[patternSlice[i]] = sSlice[i]
		}

		if valor, existe := mapa[patternSlice[i]]; existe && valor != sSlice[i] {
			return false
		}
	}
	return true
}
