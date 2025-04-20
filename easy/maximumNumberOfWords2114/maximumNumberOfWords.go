package main

import (
	"fmt"
	"strings"
)

func main() {
	fmt.Println(mostWordsFound([]string{"alice and bob love leetcode", "i think so too", "this is great thanks very much"}))
	fmt.Println(mostWordsFound([]string{"please wait", "continue to fight", "continue to win"}))
	fmt.Println(mostWordsFound([]string{"w jrpihe zsyqn l dxchifbxlasaehj", "nmmfrwyl jscqyxk a xfibiooix xolyqfdspkliyejsnksfewbjom", "xnleojowaxwpyogyrayfgyuzhgtdzrsyococuqexggigtberizdzlyrdsfvryiynhg", "krpwiazoulcixkkeyogizvicdkbrsiiuhizhkxdpssynfzuigvcbovm", "rgmz rgztiup wqnvbucfqcyjivvoeedyxvjsmtqwpqpxmzdupfyfeewxegrlbjtsjkusyektigr", "o lgsbechr lqcgfiat pkqdutzrq iveyv iqzgvyddyoqqmqerbmkxlbtmdtkinlk", "hrvh efqvjilibdqxjlpmanmogiossjyxepotezo", "qstd zui nbbohtuk", "qsdrerdzjvhxjqchvuewevyzlkyydpeeblpc"}))
}

func mostWordsFound(sentences []string) int {

	maior := 0

	for i := 0; i < len(sentences); i++ {
		palavras := strings.Split(sentences[i], " ")
		if len(palavras) > maior {
			maior = len(palavras)
		}
	}
	return maior
}
