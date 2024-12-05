# SET INTERFACE

1. Set adalah salah satu collection yang berisikan elemen-elemen yang unik, atau tidak boleh duplicate
2. Set tidak memiliki index seperti di List, oleh karena itu tidak ada jaminan data yang ada di Set itu akan terurut sesuai dengan waktu kita memasukkan data ke Set
3. Set tidak memiliki method baru, jadi hanya menggunakan method yang ada di interface parent nya, yaitu Collection dan Iterable
4. Karena tidak memiliki index, untuk mengambil data di Set juga kita harus melakukan iterasi satu per satu

¥ HashSet vs LinkedHashSet
1. Di belakang HashSet dan LinkedHashSet sebenarnya sama-sama ada hash table, dimana data disimpan dalam sebuah hash table dengan mengkalkulasi hashCode() function
2. Yang membedakan adalah, HashSet tidak menjamin data terurut sesuai dengan waktu kita menambahkan data, sedangkan LinkedHashSet menjamin data terurut sesuai dengan waktu kita menambahkan data.
3. Urutan data di LinkedHashSet bisa dijaga karena di belakang nya menggunakan double linked list



