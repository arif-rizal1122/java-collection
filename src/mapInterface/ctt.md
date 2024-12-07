# MAP INTERFACE

1. Map adalah struktur data collection yang berisikan mapping antara key dan value
2. Dimana key di map itu harus unik, tidak boleh duplikat, dan satu key cuma boleh mapping ke satu key
3. Map sebenarnya mirip dengan Array, cuma bedanya kalo di Array, key adalah index (integer), sedangkan di Map, key nya bebas kita tentukan sesuai keinginan kita

¥ HASHMAP
1. HashMap adalah implementasi Map yang melakukan distribusi key menggunakan hashCode() function
2. Karena HashMap sangat bergantung dengan hashCode() function, jadi pastikan kita harus membuat function hashCode seunik mungkin, karena jika terlalu banyak nilai hashCode() yang sama, maka pendistribusian key nya tidak akan optimal sehingga proses get data di Map akan semakin lambat
3. Di HashMap pengecekan data duplikat dilakukan dengan menggunakan method equals nya

¥ WEAkHASHMAP
1. WeakHashMap adalah implementasi Map mirip dengan HashMap
2. Yang membedakan adalah WeakHashMap menggunakan weak key, dimana jika tidak digunakan lagi maka secara otomatis data di WeakHashMap akan dihapus
3. Artinya, jika terjadi garbage collection di Java, bisa dimungkinkan data di WeakHashMap akan dihapus
4. WeakHashMap cocok digunakan untuk menyimpan data cache di memory secara sementara


¥ IdentityHashMap
1. IdentittyHashMap adalah implementasi Map sama seperti HashMap
2. Yang membedakan adalah cara pengecekan kesamaan datanya, tidak menggunakan function equals, melainkan menggunakan operator == (reference equality)
3. Artinya data dianggap sama, jika memang lokasi di memory tersebut sama

¥ LinkedHashMap
1. LinkedHashMap adalah implementasi Map dengan menggunakan double linked list
2. Data di LinkedHashMap akan lebih terprediksi karena datanya akan disimpan berurutan dalam linked list sesuai urutan kita menyimpan data
3. Namun perlu diperhatikan, proses get data di LinkedHashMap akan semakin lambat karena harus melakukan iterasi data linked list terlebih dahulu
4. Gunakan LinkedHashMap jika memang kita lebih mementingkan iterasi data Map nya

¥ ENUM MAP
1. EnumMap adalah implementasi Map dimana key nya adalah enum
2. Karena data enum sudah pasti unik, oleh karena itu cocok dijadikan key di Map
3. Algoritma pendistribusian key dioptimalkan untuk enum, sehingga lebih optimal dibandingkan menggunakan hashCode() method

