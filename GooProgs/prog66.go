package main

import "fmt"

const MAX int = 3

func main() {
    a := []int{10,100,200}
    var i int

    for i = 0; i < MAX; i++ {
        fmt.Printf("Value of a[%d] = %d\n", i, a[i] )
    }
}
