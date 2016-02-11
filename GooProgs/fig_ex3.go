package main

type BookInfo struct { subject string; book_id int }

type Books struct { title string; author string; info BookInfo }

func main() {
 var Book1 Books
 Book1.title = "Go Programming"
}
