package main

import (
	"fmt"
)

func flips(pwd string) int {
	flips := 0

	for i := 0; i < len(pwd); i += 2 {
		a := pwd[i]
		b := pwd[i+1]

		if a != b {
			flips++
		}
	}

	return flips
}

func main() {

	// 3
	fmt.Println(flips("1110011000"))
}
