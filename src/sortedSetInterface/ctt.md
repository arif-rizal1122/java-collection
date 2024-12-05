# SORTEDSET INTERFACE


1. SortedSet adalah turunan dari Set, namun di SortedSet elemen-elemen yang dimasukkan kedalam SortedSet akan otomatis diurutkan
2. Jika element adalah turunan dari interface Comparable, maka secara otomatis akan diurutkan menggunakan comparable tersebut
3. Jika element bukan turunan dari interface Comparable, maka kita bisa menggunakan Comparator untuk memberi tahun si SortedSet bagaimana cara mengurutkan elemen-elemen nya


Method                                      Keterangan

Collections.emptySortedSet()                Membuat immutable sorted set kosong
Collections.unmodifiableSortedSet(set)      Mengubah mutable sorted set menjadi immutable

