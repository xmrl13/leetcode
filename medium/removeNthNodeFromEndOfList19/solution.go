package main

type ListNode struct {
	Val  int
	Next *ListNode
}

func reverseList(head *ListNode) *ListNode {

	var prev *ListNode = nil
	var cur = head

	for cur != nil {
		var next = cur.Next
		cur.Next = prev
		prev = cur
		cur = next
	}
	return prev
}
