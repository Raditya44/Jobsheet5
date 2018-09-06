# Jobsheet5
Latihan 1<br>
Sebelum value name diganti null<br>
![alt text](https://github.com/Raditya44/Jobsheet5/blob/master/1.1.PNG)<br>
Setelah value name diganti null<br>
![alt text](https://github.com/Raditya44/Jobsheet5/blob/master/1.2.PNG)<br>
Yang terjadi adalah program error karena name=null yang artinya tidak memiliki panjang<br>
Latihan 2<br>
![alt text](https://github.com/Raditya44/Jobsheet5/blob/master/2.1.PNG)<br>
![alt text](https://github.com/Raditya44/Jobsheet5/blob/master/2.2.PNG)<br>
Yang terjadi adalah error karena indeks array melebihi kapasitas array yang ada yaitu 2<br>
Latihan 3<br>
![alt text](https://github.com/Raditya44/Jobsheet5/blob/master/3.1.PNG)<br>
![alt text](https://github.com/Raditya44/Jobsheet5/blob/master/3.2.PNG)<br>
Yang terjadi adalah terjadi error karena adanya pembagian suatu bilangan integer dengan 0<br>
Latihan 4<br>
![alt text](https://github.com/Raditya44/Jobsheet5/blob/master/4.1.PNG)<br>
![alt text](https://github.com/Raditya44/Jobsheet5/blob/master/4.2.PNG)<br>
Yang terjadi adalah error karena nilai pada c seharusnya integer(bilangan numerik) tetapi  diinputkan "a" yang seharusnya bertype data string<br>
Latihan 5<br>
![alt text](https://github.com/Raditya44/Jobsheet5/blob/master/5.1.PNG)<br>
![alt text](https://github.com/Raditya44/Jobsheet5/blob/master/5.2.PNG)<br>
Yang terjadi adalah error karena variabel b tidak memiliki nilai sehingga tidak dapat dioperasikan(inisialisasi tidak sempurna). Sedangkan setelah deklarasi b diberi nilai 5 maka program tidak akan mengalami error<br>
Latihan 6<br>
![alt text](https://github.com/Raditya44/Jobsheet5/blob/master/6.1.PNG)<br>
Yang terjadi adalah error karena pada class Clone tidak terdapat method apapun yang dapat diselect<br>
Latihan 7<br>
![alt text](https://github.com/Raditya44/Jobsheet5/blob/master/7.1.PNG)<br>
Yang terjadi adalah error karena kesalahan inputan. Program java diminta untuk menginput bilangan integer tetapi diinputkan String="LIMA"<br>
Tugas Praktikum<br>
1.	Jelaskan perbedaan penggunaan try catch finally dan throw throws!<br>
Try adalah keyword yang digunakan untuk menjalankan block program mengenai dimana munculnya kesalahan yang ingin diproses dan biasanya dipasangkan dengan catch atau finally yang berfungsi untuk mengangkap kesalahan atau bug.<br>
Sedangkan throw dan throws digunakan untuk melemparkan suatu bug yang dibuat secara manual. Keyword ini digunakan dalam suatu method atau class yang mungkin menghasilkan suatu kesalahan.<br>
2.	Jelaskan dengan bahasa dan pemahanmu sendiri mengenai jenis-jenis exception yang ada!<br>
a.	ClassNotFoundException<br>
Terjadi bila ingin menggunakan kelas yang tidak ada atau belum dibuat. <br>
b.	CloneNotSupportedException <br>
Terjadi bila ingin meng-clone atau menggandakan suatu kelas yang tidak didukung oleh method clone<br>
c.	RuntimeException <br>
Disebabkan oleh proses inisialisasi program yang tidak sempurna<br>
d.	NullPointerException<br>
Disebabkan karena pada saat runtime, terjadi pemanggilan atribut atau metode terhadap sebuah objek yang belum diinisialisasi, alias masih null. <br>
e.	ArrayIndexOutOfBoundsException<br>
Disebabkan akses array yang melebihi kapasitas array yang ada <br>
f.	ArithmeticException<br>
Khusus untuk operasi aritmatika integer. Seperti pembagian suatu bilangan integer dengan 0<br>
g.	InputMismatchException<br>
Disebabkan jika terjadi kesalahan inputan, contoh suatu program Java diminta inputan bilangan integer, dan ternyata diinputkan String.<br>
h.	NumberFormatException <br>
Terjadi saat kita mencoba mengubah String menjadi nilai angka namun String tersebut tidak terformat dengan benar.<br>
i.	IOException<br>
Terjadi bila ada I/O error, seperti gagal menemukan dan membuka file. User memasukkan input yang tidak valid. Subkelas ini memiliki beberapa subkelas lain, seperti InterruptedIOException, EOFException, serta FileNotFoundException.<br>
![alt text](https://github.com/Raditya44/Jobsheet5/blob/master/TP1.PNG)<br>
3.	Buatlah dua program exception handling dengan menggunakan try catch finally dan throw throws (2 jenis exception)!<br>


