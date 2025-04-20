package main

import "fmt"

func main() {

	// 6
	fmt.Println(timeRequiredToBuy([]int{2, 3, 2}, 2))
	// 8
	fmt.Println(timeRequiredToBuy([]int{5, 1, 1, 1}, 0))

}

func timeRequiredToBuy(tickets []int, k int) int {

	/*
		total := 0
		target := tickets[k]

		for i := 0; i < len(tickets); i++ {
			if i <= k {
				if tickets[i] <= target {
					total += tickets[i]
				} else {
					total += target
				}
			} else {
				if tickets[i] < target {
					total += tickets[i]
				} else {
					total += target - 1
				}
			}
		}
		return total
	*/

	control := 0
	ticketsLentgh := len(tickets)

	for index := 0; tickets[k] != 0; index = (index + 1) % ticketsLentgh {
		if tickets[index] != 0 {
			tickets[index]--
			control++
		}
	}
	return control
}
