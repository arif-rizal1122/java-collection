# BINARY SEARCH

1. Secara default List di Java memiliki fitur search atau get data, namun implementasinya menggunakan sequential search, artinya data akan di cek satu per satu dari awal
2. Salah satu algoritma pencarian yang populer adalah binary search, namun binary search hanya bisa dilakukan jika datanya telah berurutan
3. Untungnya di Java Collection sudah ada implementasi binary search, sehingga kita tidak perlu membuatnya secara manual



Method                                               Keterangan

Collections.binarySearch(list, value)                Mencari menggunakan binary search
Collections.binarySearch(list, value, comparator)    Mencari menggunakan binary search dengan bantuan comparator

