package main

import "fmt"

func main() {
	//2
	fmt.Println(removeDuplicates([]int{1, 1, 2}))
	//5
	fmt.Println(removeDuplicates([]int{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}))
}
func removeDuplicates(nums []int) int {

	var unicos = 1
	atual := 0

	for i := 1; i < len(nums); i++ {
		if nums[i] != nums[i-1] {
			atual = nums[i]
			nums[unicos] = atual
			unicos++
		}
	}
	return unicos
}
