# IMUTABLE LIST

1. Secara default, List di Java baik itu ArrayList ataupun LinkedList datanya bersifat mutable (Bisa diubah)
2. Di Java mendukung pembuatan Immutable List, artinya datanya tidak bisa diubah lagi.
3. Sekali List dibuat, datanya tidak bisa diubah lagi, alias final.
4. Tapi ingat, data list nya yang tidak bisa diubah, bukan reference object element nya. Kalo misal kiat membuat Immutable List berisikan data Person, field data Person tetap bisa diubah, tapi isi elemen dari Immutable List tidak bisa diubah lagi
5. Ini cocok ketika kasus-kasus misal, tidak sembarangan code yang boleh mengubah element di List


¥ Membuat Immutable List

Method                                 Keterangan

Collections.emptyList()                Membuat immutable list kosong
Collections.singletonList(e)           Membuat immutable list berisi 1 element
Collections.unmodifiableList(list)     Mengubah mutable list menjadi immutable
List.of(e...)                          Membuat immutable list dari element - element


