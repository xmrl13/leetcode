package main

import "fmt"

func main() {

	fmt.Println(findTheTownJudge(2, [][]int{{1, 2}}))
	fmt.Println(findTheTownJudge(3, [][]int{{1, 3}, {2, 3}}))
	fmt.Println(findTheTownJudge(3, [][]int{{1, 3}, {2, 3}}))
	fmt.Println(findTheTownJudge(3, [][]int{{1, 3}, {2, 3}, {3, 1}}))
	fmt.Println(findTheTownJudge(3, [][]int{{1, 2}, {2, 3}}))
}

func findTheTownJudge(n int, trust [][]int) int {

	count := make([]int, n+1)

	for _, row := range trust {
		count[row[0]]--
		count[row[1]]++
	}
	for i := 1; i <= n; i++ {
		if count[i] == n-1 {
			return i
		}
	}
	return -1
}
