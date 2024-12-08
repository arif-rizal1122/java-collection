# DEFAULT METHOD

1. Di Java 8 ada fitur bernama Default Method, dimana kita bisa menambahkan konkrit method di interface
2. Fitur ini banyak sekali digunakan di Java Collection, karena kita tahu semua collection di Java memiliki kontrak interface, sehingga dengan mudah di Java bisa meng-improve kemampuan semua collection hanya dengan menambahkan default method di interface collection nya


¥ Default Method di Collection
Default Method                              Keterangan

Iterable.forEach(consumer)                  Melakukan iterasi seluruh data collection
List.removeIf(predicate)                    Menghapus data di collection menggunakan predicate
List.replaceAll(operator)                   Mengubah seluruh data di collection

¥ Default Method di map
Default Method                              Keterangan

getOrDefault(key, defaultValue)             Mengambil data berdasarkan key, jika tidak ada, return defaultValue
forEach(consumer)                           Melakukan iterasi seluruh data key-value
replaceAll(function)                        Mengubah seluruh data value
putIfAbsent(key, value)                     Simpan data ke map jika belum ada
remove(key, value)                          Hapus jika key-value nya sama
replace(key, oldValue, newValue)            Ubah key jika value sekarang sama dengan oldValue
computeIfAbsent(key, function)              Ubah key dengan value hasil function jika belum ada
computeIfPresent(key, function)             Ubah key dengan value hasil function jika sudah ada
… dan masih banyak 
 

