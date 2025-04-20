package main

import (
	"fmt"
)

func lengthOfLongestSubstring(s string) int {

	length := 0
	tempLength := 0
	index := 0

	set := make(map[string]bool)

	if len(s) == 0 {
		return 0
	}

	if len(s) == 1 {
		return 1
	}

	for i := 0; i < len(s); i++ {

		char := string(s[i])

		if !set[char] {
			set[char] = true
			if tempLength == 0 {
				index = i
			}
			tempLength++
		} else {
			set = make(map[string]bool)
			i = index + 1
			if tempLength >= length {
				length = tempLength
			}
			tempLength = 0
		}
	}
	return length
}

func main() {
	// 3 abc
	//	fmt.Println(lengthOfLongestSubstring("abcabcbb"))
	// 2 au
	fmt.Println(lengthOfLongestSubstring("au"))
	// 1 b
	//	fmt.Println(lengthOfLongestSubstring("bbbbb"))
	// 3 wke
	//	fmt.Println(lengthOfLongestSubstring("pwwkew"))

}
