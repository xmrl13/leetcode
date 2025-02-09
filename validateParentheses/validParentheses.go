package main

import "fmt"

func main() {
	fmt.Println(isValid("{}"))
	fmt.Println(isValid("()[]{}"))
	fmt.Println(isValid("(]"))
	fmt.Println(isValid("([])"))
	fmt.Println(isValid("(])"))
}
func isValid(s string) bool {

	var abre []int

	for i := 0; i < len(s); i++ {
		if s[i] == '{' || s[i] == '[' || s[i] == '(' {
			abre = append(abre, int(s[i]))
		} else if s[i] == '}' || s[i] == ']' || s[i] == ')' {
			if len(abre) == 0 {
				return false
			}

			if s[i] == '}' && abre[len(abre)-1] == '{' ||
				s[i] == ']' && abre[len(abre)-1] == '[' ||
				s[i] == ')' && abre[len(abre)-1] == '(' {
				abre = abre[:len(abre)-1]
			} else {
				return false
			}
		}
	}
	return len(abre) == 0
}
