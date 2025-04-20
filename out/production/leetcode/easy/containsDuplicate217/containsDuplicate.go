package main

import "fmt"

func main() {

	fmt.Println(containsDuplicate([]int{1, 2, 3, 1}))
	fmt.Println(containsDuplicate([]int{1, 2, 3, 4}))
	fmt.Println(containsDuplicate([]int{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}))
}

func containsDuplicate(nums []int) bool {

	mapa := make(map[int]int)

	for i := 0; i < len(nums); i++ {
		if _, existe := mapa[nums[i]]; existe {
			return true
		} else {
			mapa[nums[i]] = nums[i]
		}
	}
	return false
}
