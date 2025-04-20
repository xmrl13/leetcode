package main

import "fmt"

func main() {
	fmt.Println(pivotIndex([]int{1, 7, 3, 6, 5, 6}))
	fmt.Println(pivotIndex([]int{1, 2, 3}))
	fmt.Println(pivotIndex([]int{2, 1 - 2}))
}

func pivotIndex(nums []int) int {
	var left = 0
	var right = 0

	for i := 0; i < len(nums); i++ {
		right += nums[i]
	}

	for i := 0; i < len(nums); i++ {
		if i == 0 {
			left += nums[i]
		}
		if i >= 1 {
			left += nums[i-1]
			right -= nums[i]
		}
		if left == right {
			return i
		}
	}

	return -1
}
