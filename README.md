# JOBSHEET 12

## Peercobaan 1
### Pertanyaan

1. Apakah fungsi tanpa parameter selalu harus bertipe void?

2. Apakah daftar menu pada program kafe dapat ditampilkan tanpa menggunakan fungsi Menu()? Modifikasi kode program tersebut untuk dapat menampilkan daftar menu tanpa menggunakan fungsi!

3. Jelaskan keuntungan menggunakan fungsi Menu() dibandingkan menulis semua perintah penampilan menu langsung di dalam fungsi main.

4. Uraikan secara singkat alur eksekusi program ketika fungsi Menu() dipanggil dari main (mulai dari program dijalankan sampai daftar menu tampil di layar).

### Jawaban

1. Tidak,Fungsi tanpa parameter bisa mengembalikan nilai seperti `int, double, atau String` asalkan menggunakan kata kunci return.

2. BISA. Caranya dengan memindahkan perintah `System.out.println` langsung ke dalam `main`
![alt text](image-3.png)

3. 
- Jika menu perlu ditampilkan berkali-kali cukup panggil menu().
- Kode lebih rapi
- Jika ada perubahan harga cukup ubah yang ada di dalam fungsi.

4. Alur:
- Program mulai di main 
- Bertemu panggil menu() 
- Lompat masuk ke fungsi menu 
- Cetak semua baris menu ke layar 
- Kembali lagi ke main (setelah baris pemanggilan) 
- Program selesai.

## Peercobaan 2
### Pertanyaan

1. Apakah kegunaan parameter di dalam fungsi?

2. Jelaskan mengapa pada percobaan ini fungsi Menu() menggunakan parameter namaPelanggan dan isMember?

3. Apakah parameter sama dengan variabel? Jelaskan.

4. Jelaskan bagaimana cara kerja parameter isMember pada fungsi Menu(). Apa perbedaan output ketika isMember bernilai true dan ketika false?

5. Apa yang akan terjadi jika memanggil fungsi Menu() tanpa menyertakan parameter namaPelanggan dan isMember?

6. Modifikasi kode di atas dengan menambahkan parameter baru kodePromo (String). Jika kodePromo adalah "DISKON50", tampilkan berikan diskon 50%. Jika kodePromo adalah "DISKON30", tampilkan berikan diskon 30%. Jika tidak ada kode promo yang berlaku, tampilkan kode invalid.

7. Berdasarkan fungsi Menu() di atas, jika nama pelanggan adalah "Budi", pelanggan tersebut member, dan menggunakan kode promo "DISKON30", tuliskan satu baris perintah pemanggilan fungsi menu yang benar.

8. Menurut Anda, apakah penggunaan parameter namaPelanggan dan isMember pada fungsi Menu() membuat program lebih mudah dibaca dan dikembangkan dibandingkan jika nilai-nilai tersebut ditulis langsung di dalam fungsi tanpa parameter?
### Jawaban

1. Sebagai wadah untuk menampung nilai input yang dikirimkan ke dalam fungsi

2. Agar fungsi Menu() tidak statis (kaku). Dengan parameter, fungsi bisa memanggil nama orang yang berbeda-beda dan memberikan status yang berbeda tanpa perlu mengubah kode di dalam fungsinya.

3. Ya, Parameter pada dasarnya adalah variabel lokal yang dideklarasikan di dalam tanda kurung fungsi. Bedanya, nilai awal parameter ditentukan oleh pemanggil fungsi (argumen)

4. Parameter isMember dicek menggunakan logika if:
- Jika true: Program mencetak "Anda adalah member, dapatkan diskon 10%...".

- Jika false: Pesan diskon tidak ditampilkan.

5. Akan terjadi Compile Time Error. Java mewajibkan jumlah dan tipe data argumen saat pemanggilan harus sama persis dengan definisi parameternya.

6. Modifikasi Mode
![alt text](image-4.png)

7. berhasil di jalankan dan memberikan `promo berlaku: Diskon 30%!`

8. Ya, sangat membantu. Kode menjadi lebih ringkas dan mudah dikembangkan karena kita tidak perlu membuat fungsi baru atau mengubah isi fungsi setiap kali ada pelanggan dengan nama atau status yang berbeda.

## Peercobaan 3
### Pertanyaan
1. Jelaskan secara singkat kapan suatu fungsi membutuhkan nilai kembalian (return value) dan kapan fungsi tidak perlu mengembalikan nilai. Berikan minimal satu contoh dari program kafe pada Percobaan 3 untuk masing-masing kasus.
2. Fungsi hitungTotalHargaNoAbsen saat ini mengembalikan total harga berdasarkan pilihanMenu dan jumlahPesanan. Sebutkan tipe data nilai kembalian dan dua buah parameter yang digunakan fungsi tersebut. Jelaskan arti masing-masing parameter dalam konteks program kafe.
3. Modifikasi kode di atas sehingga fungsi hitungTotalHargaNoAbsen dapat menerima kodePromo. Jika kodePromo adalah "DISKON50", maka mendapat diskon 50% dari totalHarga dan tampilkan diskon. Jika kodePromo adalah "DISKON30", maka mendapat diskon 30% dari totalHarga dan tampilkan diskon. Jika tidak ada kode promo yang berlaku, tampilkan kode invalid dan tidak ada pengurangan total harga totalHarga.
4. Modifikasi kode di atas sehingga bisa memilih beberapa jenis menu berbeda serta menampilkan total keseluruhan pesanan. Bagaimana memodifikasi program sehingga pengguna dapat: memesan lebih dari satu jenis menu (misalnya menu 1 dan 3 sekaligus), dan menampilkan total keseluruhan pesanan (gabungan dari semua jenis menu)?
### Jawaban
1. 
- Butuh Return Value: Ketika hasil olahan fungsi tersebut akan digunakan kembali untuk perhitungan lain di dalam program.
 Contoh: hitungTotalHarga mengembalikan nilai int agar nilai harganya bisa ditambahkan ke variabel total di dalam main.

- Tidak Butuh (Void): Ketika fungsi hanya bertugas melakukan aksi langsung 
 (seperti menampilkan teks) dan tidak perlu melaporkan hasil apa pun ke pemanggilnya.
 Contoh: menu bertipe void karena hanya menampilkan daftar menu ke layar.

2. type data yang dikembalikan adalah int dan dua type data yang di gunakan adalah ber type int semua.

3. Sudah
4. Sudah

## Peercobaan 4
### Pertanyaan
1. Jelaskan mengapa penulisan parameter di praktikum 4 ditulis dengan String... namaPengunjung!
2. Modifikasi method daftarPengunjung menggunakan for-each loop.
3. Bisakah menggunakan dua tipe data varaargs dalam satu fungsi? Jelaskan jawaban Anda berdasarkan aturan varargs di Java, dan berikan contohnya!
4. Jelaskan apa yang terjadi jika fungsi daftarPengunjung dipanggil tanpa argumen. Apakah program akan error saat kompilasi, error saat dijalankan, atau tetap berjalan? Jika tetap berjalan, bagaimana output yang dihasilkan?

### Jawaban
1. agar method daftarPengunjung bersifat fleksibel, yaitu bisa menerima inputan nama (argumen) dalam jumlah berapapun tanpa harus membuat array secara manual saat memanggilnya.

2. Sudah
3. TIDAK BISA, karena aturan Java menetapkan bahwa parameter Variabel Argumen harus menjadi parameter terakhir dalam sebuah fungsi. Karena hanya ada satu posisi "terakhir" yaitu Variabel Argumen. Vaariabel Argumen dapat menerima 0 argumen. outputnya hanya akan berisi Daftar Nama Pengunjung:

4. Program tetap berjalan (tidak error), akan tetapi Program hanya akan mencetak tulisan `"Daftar Nama Pengunjung:"`

## Peercobaan 5
### Pertanyaan
1. Sebutkan tahapan dan urutan eksekusi program pada Percobaan 5, mulai dari program dijalankan hingga menampilkan luas persegi panjang dan volume balok!
2. Tuliskan output yang dihasilkan program HitungBalokNoAbsen jika pengguna memasukkan panjang = 4, lebar = 3, dan tinggi = 5. Jelaskan secara singkat alur jalannya program sampai output tersebut muncul.
3. Apakah output dari program di bawah ini kemudian jelaskan alur jalannya program tersebut!
![alt text](image-2.png)

4. Pada saat apakah fungsi yang kita buat harus menggunakan parameter atau tidak? Pada saat apakah fungsi yang kita buat harus memiliki nilai kembalian atau tidak? Jelaskan!
5. Jelaskan kapan sebuah fungsi sebaiknya menggunakan parameter dan kapan fungsi boleh tanpa parameter, dengan mengacu pada fungsi hitungLuas dan hitungVolume di Percobaan 5.
6. Jelaskan kapan sebuah fungsi sebaiknya memiliki nilai kembalian (return value) dan kapan tidak perlu memiliki nilai kembalian, dengan mengacu pada fungsi main, hitungLuas, dan hitungVolume.

### Jawaban
1. Tahapan Eksekusi Percobaan 5 (HitungBalok06):
- Program mulai dari main, melakukan inisialisasi Scanner.
- User menginput nilai panjang (p), lebar (l), dan tinggi (t).
- Program memanggil fungsi hitungLuas(p, l), menghitung hasil, mengembalikan nilai, lalu mencetak Luas.
- Program memanggil fungsi hitungVolume(p, l, t). Di dalam fungsi ini, program memanggil kembali hitungLuas, mengalikan hasilnya dengan tinggi, mengembalikan nilai volume, lalu mencetak Volume.
- Program selesai.

2. Alur program:
- program dijalankan
- Input pengguna: panjang = 4, lebar = 3, dan tinggi = 5.
- Menghitung luas persegi panjang Fungsi dipanggil Di dalam hitungLuas: Luas = 4 * 3 = 12.
- Menampilkan luas
- Fungsi dipanggil Hitung volume: volume = 12 * 5 = 60.
- Menampilkan volume
- Program selesai → Scanner ditutup, eksekusi berhenti.

3. Alur jalannya:
- `main` memanggil `Jumlah(1, 1)`, hasilnya `2` disimpan di `temp`.
- `main` memanggil `TampilJumlah(2, 5)`.
- Di dalam `TampilJumlah`, dipanggil `Jumlah(2, 5)` yang menghasilkan `7`.
- Nilai `7` dikirim ke `TampilHinggaKei(7)`.
- Fungsi ini melakukan looping dari 1 sampai 7 dan mencetaknya menggunakan `print` (tanpa enter), sehingga menghasilkan `1234567`.

4. Parameter: Digunakan saat fungsi membutuhkan data dinamis/input dari luar untuk diolah (agar fungsi fleksibel). Jika tidak butuh input luar, tidak perlu parameter. Return: Digunakan saat hasil olahan fungsi akan diolah lagi oleh program lain. Jika fungsi hanya bertugas menampilkan sesuatu dan selesai, gunakan void (tidak perlu return).

5. 
- Fungsi menggunakan parameter ketika membutuhkan data dari luar agar dapat melakukan perhitungan atau aksi secara fleksibel.
- Fungsi boleh tanpa parameter jika tidak memerlukan input dari luar atau data sudah tersedia di dalam fungsi itu sendiri. Biasanya untuk aksi tetap, seperti menampilkan pesan statis.

6. 
- Fungsi memiliki nilai kembalian ketika hasil perhitungan atau informasi dari fungsi perlu digunakan di tempat lain, misalnya disimpan di variabel atau diproses lebih lanjut.
- Fungsi tidak perlu nilai kembalian (void) jika hanya melakukan aksi, misalnya menampilkan informasi atau memodifikasi variabel internal, tanpa perlu mengembalikan hasil ke pemanggil.