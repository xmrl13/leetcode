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

	//Lista que usaremos para colocar os abre parenteses
	//Se houve implementacao built-in poderiamos usar uma pilha
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
				//Removendo o ultimo elemento do slice criando um slice de comprimento menor uma unidade que o original
				//o dois pontos serve para dizer que estamos trabalhando no final do slice e nao no comeco
				abre = abre[:len(abre)-1]
			} else {
				return false
			}
		}
	}
	return len(abre) == 0
}
