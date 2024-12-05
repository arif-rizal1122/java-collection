# ITERABLE & ITERATOR

1. Iterable adalah parent untuk semua collection di Java, kecuali Map
2. Iterable sendiri sangat sederhana, hanya digunakan agar mendukung for-each loop
3. Karena semua collection pasti implement iterable, secara otomatis maka semua collection di Java mendukung perulangan for-each, jadi bukan cuma Array

¥ ITERATOR INTERFACE

1. Tidak ada magic di Java, sebenarnya for-each di Iterable bisa terjadi karena ada method iterator() yang mengembalikan object Iterator
2. Iterator adalah interface yang mendefinisikan cara kita melakukan mengakses element di collection secara sequential
3. For-each sendiri muncul sejak Java 5, sebelum Java 5 untuk melakukan iterasi collection, biasanya dilakukan manual menggunakan Iterator object
