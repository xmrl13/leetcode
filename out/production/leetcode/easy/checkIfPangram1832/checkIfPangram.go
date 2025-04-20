package main

import (
	"fmt"
	"strings"
)

func main() {

	fmt.Println(checkIfPangram("leetcode"))
	fmt.Println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"))

}

func checkIfPangram(sentence string) bool {

	if len(sentence) < 26 {
		return false
	}

	var lista = strings.Split(sentence, "")

	mapa := make(map[string]string)

	for i := 0; i < len(lista); i++ {
		mapa[lista[i]] = lista[i]
	}
	return len(mapa) == 26
}
