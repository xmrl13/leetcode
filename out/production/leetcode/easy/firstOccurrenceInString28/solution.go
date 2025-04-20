package main

import "fmt"

func main() {

	// 0
	fmt.Println(strStr("sadbutsad", "sad"))
	// -1
	fmt.Println(strStr("leetcode", "leeto"))

}

func strStr(haystack string, needle string) int {

	sizeNeedle := len(needle)
	sizeHaystack := len(haystack)
	controle := -1
	index := 0

	for i := 0; i < sizeHaystack; i++ {

		if haystack[i] == needle[index] {

			if index == 0 {
				controle = i
			}

			index++

			if index == sizeNeedle {
				return controle
			}
		} else {
			if index > 0 {
				i = controle
			}
			controle = -1
			index = 0
		}
	}
	return -1
}
