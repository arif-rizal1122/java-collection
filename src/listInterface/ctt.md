# LIST INTERFACE

1. List adalah struktur data collection yang memiliki sifat sebagai berikut
   ° Elemen  di list bisa duplikat, artinya bisa memasukkan data yang sama
   ° Data list berurut sesuai dengan posisi kita memasukkan data
   ° List memiliki index, sehingga kita bisa menggunakan nomor index untuk mendapatkan element di list
2. Di Java ada beberapa implementasi List, dan kita bisa memilih sesuai dengan kebutuhan kita

¥ ARRAY LIST CLASS
1. ArrayList adalah implementasi dari List menggunakan array
2. Default kapasitas array di ArrayList adalah 10
3. Namun ketika kita memasukkan data dan array sudah penuh, maka secara otomatis ArrayList akan membuat array baru dengan kapasitas baru dengan ukuran kapasitas lama + data baru

¥ LINKEDLIST
1. LinkedList adalah implementasi List dengan struktur data Double Linked List
2. Bagi yang sudah belajar tentang struktur data di sekolah / kampus pasti tau apa itu double linked list


¥ ArrayList vs LinkedList

add    | Cepat jika kapasitas Array masih cukup, lambat jika sudah penuh
         Cepat karena hanya menambah node di akhir
get    | Cepat karena tinggal gunakan index array
         Lambat karena harus di cek dari node awal sampai ketemu index nya
set    | Cepat karena tinggal gunakan index array
         Lambat karena harus di cek dari node awal sampai ketemu
remove | Lambat karena harus menggeser data di belakang yang dihapus
         Cepat karena tinggal ubah prev dan next di node sebelah yang dihapus

