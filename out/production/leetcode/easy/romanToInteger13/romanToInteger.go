package main

import "fmt"

func main() {
	fmt.Println(romanToInt("VII"))
	fmt.Println(romanToInt("LVIII"))
	fmt.Println(romanToInt("MCMXCIV"))
}

func romanToInt(s string) int {

	mapa := make(map[rune]int)

	mapa['I'] = 1
	mapa['V'] = 5
	mapa['X'] = 10
	mapa['L'] = 50
	mapa['C'] = 100
	mapa['D'] = 500
	mapa['M'] = 1000

	var total = 0

	for i := 0; i < len(s); i++ {
		fmt.Println(mapa[rune(s[i])])
		if i < len(s)-1 && mapa[rune(s[i])] < mapa[rune(s[i+1])] {
			total += mapa[rune(s[i+1])] - mapa[rune(s[i])]
			i++
		} else {
			total += mapa[rune(s[i])]
		}
	}
	return total
}
