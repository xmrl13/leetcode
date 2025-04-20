package main

import "fmt"

func main() {
	fmt.Println(reverseList([]int{1, 2, 3, 4, 5}))
}

func reverseList(list []int) []int {

	left := 0
	right := len(list) - 1

	for left < right {
		temp := list[left]
		list[left] = list[right]
		list[right] = temp
		left++
		right--
	}

	return list
}
