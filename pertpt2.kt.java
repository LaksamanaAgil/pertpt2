/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */


//TODO: PT1:PROGRAM PERTAMA DI KOTLIN
//fun main() { //TODO: Function Default dalam sebuah empty activity, yang mencetak kalimat Hello, World! ke halaman app
    //println("Hello, world!")
//}

//fun main() { //TODO: Mengubah kalimat yang dicetak menjadi Hello, Android!
    //println("Hello, Android!")
//}

//fun main() { //TODO: Mencetak kalimat tersebut dua kali dalam dua baris berbeda
    //println("Hello, Android!")
    //println("Hello, Android!")
//}

//fun main() { //TODO: Mencetak Today is sunny! pada halaman
    //println("Today is sunny!")
//}

//fun main() { //TODO: Mencetak angka 1-3 pada 3 baris berbeda
    //println("1")
    //println("2")
    //println("3")
//}

//fun main() { //TODO: Membuat program untuk mencetak kalimat I`m learning kotlin!, masing-masing kata pada baris yang berbeda
    //println("I'm")
    //println("learning")
    //println("Kotlin!")
//}

//fun main() { //TODO: Memperbaiki urutan hari yang salah pada modul, serta mencetak hari senin-jumat yang diperbaiki pada barisan yang berbeda
    //println("Monday")
    //println("Tuesday")
    //println("Wednesday")
    //println("Thursday")
    //println("Friday")
//}

///fun main() { //TODO: Memperbaiki error yang dalam program karena kurangnya tanda }
    ///println("Tomorrow is rainy")
///} //TODO: Perbaikan kode

//fun main() {
    //println("There is a chance of snow") //TODO: Memperbaiki error yang terjadi karena menggunakan printLine (diperbaiki menjadi println)
//}

//fun main() { //TODO: Memperbaiki error yang terjadi karena menggabungkan 3 commandline yang seharusnya dipisah menjadi 3 barisan
    //println("Cloudy")
    //println("Partly Cloudy")
    //println("Windy")
//}

//fun main() { //TODO: Memperbaiki error yang terjadi karena menggunakan kurung (), yang seharusnya digunakan adalah {}
    //println("How's the weather today?")
//}

























//TODO: PT2: Membuat dan menggunakan variabel di KotlinURL

//fun main() {
    //val count: Int = 2
    //println(count)
//}

//fun main() {
    //val count: Int = 2
    //println("You have $count unread messages.")
//}

//fun main() {
    //val count: Int = 10
    //println("You have $count unread messages.")
//}

//fun main() {
    //val unreadCount = 5
    //val readCount = 100
    //println("You have ${unreadCount + readCount} total messages in your inbox.")
//}

//fun main() { //TODO: Function yang mengandung nilai jumlah total foto dan foto yang dihapus, serta cetakan jumlah  foto, foto yang dihapus,serta foto yang tersisa
    //val numberOfPhotos = 100
    //val photosDeleted = 10
    //println("$numberOfPhotos photos")
    //println("$photosDeleted photos deleted")
    //println("${numberOfPhotos - photosDeleted} photos left")
//}

//fun main() {
    //var cartTotal = 0
    //cartTotal = 20
    //println("Total: $cartTotal")
//}

//fun main() {
    //var cartTotal = 0
    //println("Total: $cartTotal")

    //cartTotal = 20
    //println("Total: $cartTotal")
//}

//fun main() {
    //var count = 10 //TODO: Nilai awal count
    //println("You have $count unread messages.")
    //count = count + 1 //TODO: Menambah nilai variabel count 
    //println("You have $count unread messages.")
//}

//fun main() {
    //var count = 10
    //println("You have $count unread messages.")
    //count++ //TODO: Menggunakan kode menambah value yang lebih mudah dengan tujuan yg sama
    //println("You have $count unread messages.") //TODO: Mencetak nilai count setelah ditambah
//}

//fun main() {
    //var count = 10
    //println("You have $count unread messages.")
    //count-- //TODO: Mengurangi value count
    //println("You have $count unread messages.") //TODO: Mencetak nilai count setelah dikurang
//}

//fun main() { //TODO: Kode pertama yang dimasukkan di nomor 5 pt2
    //val trip1: Double = 3.20
    //val trip2: Double = 4.10
    //val trip3: Double = 1.72
    
    //TODO: Kode asli sebelum perubahan
    //val totalTripLength: Double = 0.0 //TODO: totalTriplength telah ditetapkan sebagai 0.0, sehingga trip1-3 belum berpengaruh pada hasil akhir
    //TODO: Perubahan 1: Nilai totalTripLength ditentukan oleh value double trip1-3
    //val totalTripLength: Double = trip1 + trip2 + trip3 //TODO: Hasilnya 9.02 miles left
    //TODO: Perubahan 2: NilaitotalTriplength tidak ditetapkan sebagai double, sehingga kode lebih simpel
    //val totalTripLength = trip1 + trip2 + trip3 //TODO: Hasil tetap 9.02 miles left
    //println("$totalTripLength miles left to destination") 
//}
//TODO: Program yang mencetak tanggal per5temuan berikutnya
//fun main() {
    //val nextMeeting = "Next meeting:"//TODO: Kode asli sebelum dimodifikasi, hasilnya Next meeting:January 1, tanpa ada spasi antara next meeting dan Jaunuary
    //val nextMeeting = "Next meeting: " //TODO: Modifikasi pertama, menambahkan spasi kosong setelah meeting:, hasilnya Next meeting: January 1
    //val date = "January 1"
    //val reminder = nextMeeting + date //TODO: Kode asli sebelum modifikasi kedua
    //val reminder = nextMeeting + date + " at work" //TODO: Modifikasi kedua,yang menghasilkan Next meeting: January 1 at work
    //println(reminder)
//}

//TODO: Mencetak sebuah quotation mark atau "" 
//fun main() {
    //println("Say \"hello\"") //TODO: Jika tidak menggunakan \, maka hasilnya akan error
//}

//TODO: Mencetak status sebuah value boolean (true atau false)
//fun main() {
    //val notificationsEnabled: Boolean = true //TODO: Kode asli sebelum modifikasi, Hasil print saat value ini ditetapkan adalah "true"
    //val notificationsEnabled: Boolean = false //TODO: Kode setelah modifikasi, yang menghasilkan output print "false"
    //println(notificationsEnabled)//TODO: Kode asli sebelum modifikasi kedua
    //println("Are notifications enabled? " + notificationsEnabled) //TODO: Modifikasi kedua, menggabungkan kalimat string dengan boolean dalam cetakan println. yang menghasilkan Are notifications enabled? false
//}

//TODO: Bagian ini mencontohkan penggunaan comment
/*
 * This program displays the number of messages
 * in the user's inbox.
 */
//fun main() {
    // Create a variable for the number of unread messages.(Membuat variabel untuk jumlah pesan yang belum dibaca)
    //var count = 10
    //println("You have $count unread messages.")

    // Decrease the number of messages by 1.( Jumlah pesan dikurangi satu)
    //count--
    //println("You have $count unread messages.")
//}















//TODO: PT3: Membuat dan menggunakan fungsi di kotlin


//TODO: nomor 2:Mendefinisikan dan memanggil fungsi
//fun main() { //TODO: Kode awal nomor 2
    //println("Happy Birthday, Rover!")
    //println("You are now 5 years old!")
//}

//TODO: Kode akhir nomor 2
//fun main() { //TODO: Main memanggil function birthdayGreeting
    //birthdayGreeting()
//}

//fun birthdayGreeting() { //TODO: Function ini berfungsi mengeprint kalimat "Happy Birthday, Rover!" dan "You are now 5 years old!"
    //println("Happy Birthday, Rover!")
    //println("You are now 5 years old!")
//}

//==================================================================================================================

//TODO: nomor 3: Return String dari birthdayGreeting
//fun main() {
    //birthdayGreeting()
//}

//fun birthdayGreeting(): Unit { //TODO: Menetapkan tipe return sebagai Unit(). Secara default, tipe return jika tidak didefinisikan adalah unit
    //println("Happy Birthday, Rover!")
    //println("You are now 5 years old!")
//}

//TODO: Menyelesaikan program yang mengembalikan string dari Function birthdayGreeting
//fun birthdayGreeting(): String { //TODO: Menetapkan function birthdayGreeting
    //val nameGreeting = "Happy Birthday, Rover!" //TODO: Value nameGreeting dan ageGreeting
    //val ageGreeting = "You are now 5 years old!"
    //return "$nameGreeting\n$ageGreeting" //TODO: return memiliki fungsi yang mirip dengan print, dengan mencetak value ageGreeting dan nameGreetingyang telah ditetapkan
//}

//fun main() {//TODO: Memanggil function birthdayGreeting
    //println(birthdayGreeting())
//}

//==================================================================================================================

//TODO: Nomor 4, menambahkan parameter ke function birthdayGreeting
//fun birthdayGreeting(name: String): String { //TODO: Function birthdayGreeting dengan parameter name bertipe String
    //val nameGreeting = "Happy Birthday, $name!" //TODO: Nama berdasarkan masukan di main
    //val ageGreeting = "You are now 5 years old!"
    //return "$nameGreeting\n$ageGreeting"
//}

//fun main() { //TODO: Function main, memanggil dan mencetak birthday Greeting dengan nama orang Rex dan Rover
    //println(birthdayGreeting("Rover"))
    //println(birthdayGreeting("Rex"))
//}

//==================================================================================================================

//TODO: Nomor 5,Function dengan lebih dari 1 parameter
//fun birthdayGreeting(name: String, age: Int): String { //TODO: Function dengan parameter nama(String), dan age/umur(integer)
    //val nameGreeting = "Happy Birthday, $name!" //TODO: Nama dan umur ditentukan pada function main
    //val ageGreeting = "You are now $age years old!"
    //return "$nameGreeting\n$ageGreeting"
//}

//fun main() { //TODO: Function utama yang memanggil fungsi birthdayGreeting, bersama masukan parameter berupa nama dan umur
    //println(birthdayGreeting("Rover", 5))
    //println(birthdayGreeting("Rex", 2))
//}

//==================================================================================================================


//TODO: Nomor 6,Argumen yang bernama
//fun birthdayGreeting(name: String, age: Int): String {
    //val nameGreeting = "Happy Birthday, $name!"
    //val ageGreeting = "You are now $age years old!"
    //return "$nameGreeting\n$ageGreeting"
//}

//fun main() { //TODO: Jika parameter yang ingin disebutkan dimasukkan, user dapat menginput parameter dalam urutan apapun tanpa mempengaruhi hasil akhirnya
    //println(birthdayGreeting(name = "Rex", age = 2))
    //println(birthdayGreeting(age = 2, name = "Rex"))
//}

//==================================================================================================================

//TODO: Nomor 7, Argumen Default
//fun birthdayGreeting(name: String = "Rover", age: Int): String { //TODO: Menetapkan nama Rover sebagai nilai default name
    //return "Happy Birthday, $name! You are now $age years old!"
//}

//fun main() { //TODO: Jika parameter yang ingin disebutkan dimasukkan, user dapat menginput parameter dalam urutan apapun tanpa mempengaruhi hasil akhirnya
    //println(birthdayGreeting(age = 5))
    //println(birthdayGreeting("Rex", 2)) //TODO: Jika ada input nama baru(misal Rex), nilai name akan diganti 
//}










//TODO: PT4 lATIHAN DASAR KOTLIN
//TODO: Nomor 2 Mengeprint pesan didalam modul
//fun main() { //TODO: Mengeprint 4 pesan dalam 4 baris berbeda
    //println("Use the val keyword when the value doesn't change.")
    //println("Use the var keyword when the value can change.")
    //println("When you define a function, you define the parameters that can be passed to it.")
    //println("When you call a function, you pass arguments for the parameters.")
//}

//==================================================================================================================

//TODO: Nomor 3 , Memperbaiki error compile
//fun main() { 
    //println("New chat message from a friend") //TODO: Perbaikan error karena menggunakan ', diperbaiki dengan mengganti tanda tersebut dengan "
//}
//==================================================================================================================

//TODO: Nomor 4, Memperbaiki Template String, dimana terjadi kerusakan karena penambahan value 'offer' dan 'discountPercentage' yang tidak dapat diubah/direassign karena bersifat read-only
//TODO: Dapat dipebaiki dengan memanggil offer dan discountpercentage sebagai val

//fun main() {
    //val discountPercentage = 20 //TODO: Nilai diskon langsung ditempatkan dalam val 
    //val item = "Google Chromecast"
    //val offer = "Sale  - Up to $discountPercentage% discount off $item! Hurry Up!" //TODO: Memanggil offer sebagai val, sehingga tidak bersifat read-only

   // println(offer)
//}

//==================================================================================================================

//TODO: Nomor 5, Penyambungan String , terjadi error karena value numberofadults dan numberofkids dimasukkan sebagai variabel String. Agar masuk sebagai Int, nilai dimasukkan tanpa menggunakan ""
//fun main() {
    //val numberOfAdults = 20
    //val numberOfKids = 30
    //val total = numberOfAdults + numberOfKids
   //println("The total party size is: $total")
//}

//==================================================================================================================
//TODO: Nomor 6, Pemformatan pesan, menjelaskan ekspektasi output yang dikeluarkan program
//fun main() {
    //val baseSalary = 5000
    //val bonusAmount = 1000
    //val totalSalary = "$baseSalary + $bonusAmount" //TODO: Karena menggunakan "", maka value totalSalary menjadi variabel String, sehingga hasilnya menunjukkan "5000+1000" dan bukan digabung menjadi 6000 (Dapat dilakukan juka variabel bersifat int (tidak menggunakan ")"))
    //println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
//}

//==================================================================================================================
//TODO: Nomor 7, Operasi Matematika Dasar, menambahkan fungsi pengurangan untuk dipanggil di main
//fun tambah(no1: Int, no2: Int): Int {
    //return no1 + no2
//}

//fun kurang(no1: Int, no2: Int): Int {
    //return no1 - no2
//}
//fun main() {
    //val no1 = 10
    //val no2 = 5
    //val no3 = 8

    //val result = tambah(no1, no2)
    //val result2 = kurang(no1, no3)

    //println("$no1 + $no2 = $result")
    //println("$no1 - $no3 = $result2")
//}

//==================================================================================================================
//TODO: Nomor 8, Parameter Default, menambahkan fungsi displayAlertMessage untuk dipanggil di Main
//fun displayAlertMessage(
    //operatingSystem: String = "Unknown OS",
    //emailId: String
//): String {
    //return "There is a new sign-in request on $operatingSystem for your Google Account $emailId."
//}

//fun main() {
    //val firstUserEmailId = "user_one@gmail.com"

    // The following line of code assumes that you named your parameter as emailId.
    // If you named it differently, feel free to update the name.
    
    //println(displayAlertMessage(emailId = firstUserEmailId))
    //println()

    //val secondUserOperatingSystem = "Windows"
    //val secondUserEmailId = "user_two@gmail.com"

    //println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
    //println()

    //val thirdUserOperatingSystem = "Mac OS"
    //val thirdUserEmailId = "user_three@gmail.com"

    //println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    //println()
//}


//==================================================================================================================
//TODO: Nomor 9, Pedometer, mengubah nama parameter dan variabel sesuai aturan penamaan yang ideal
//TODO: Penamaan yang benar yaitu dengan menggunakan huruf kecil dikata pertama dalam nama, dan menggunakan awalan huruf besar dikata-kata selanjutnya, tanpa ada spasi
//fun main() {
    //val steps = 4000
    //val caloriesBurned = pedometerStepsToCalories(steps);
    //println("Walking $steps steps burns $caloriesBurned calories") 
//}

//fun pedometerStepsToCalories(numberOfSteps: Int): Double { //TODO: Misalkan PEDOMETERstepsTOcalories menjadi pedometerStepsToCalories
    //val caloriesBurnedForEachStep = 0.04
    //val totalCaloriesBurned = numberOfSteps * caloriesBurnedForEachStep
    //return totalCaloriesBurned
//}

//==================================================================================================================
//TODO: Nomor 10, Perbandingan Dua Angka, membuat fungsi untuk membandingkan lebih tinggi mana waktu penggunaan ponsel hari ini dan kemarin
//fun main() {
    //println("Waktu penggunaan ponsel lebih lama hari ini: ${bandingWaktu(300, 250)}")
    //println("Waktu penggunaan ponsel lebih lama hari ini: ${bandingWaktu(300, 300)}")
    //println("Waktu penggunaan ponsel lebih lama hari ini: ${bandingWaktu(200, 220)}")
//}
//TODO: Function dibawah menetapkan boolean menjadi true jika waktu penggunaan HP hariIni lebih banyak daripada waktu hariKemarin
//fun bandingWaktu(hariIni: Int, hariKemarin: Int): Boolean {
    //return hariIni > hariKemarin
//}

//==================================================================================================================
//TODO: Nomor 11, Memindahkan kode duplikat, agar mensimpelkan kode dan tidak penuh dengan kode yang tidak perlu
//fun main() { //TODO: Main memanggil function printCuacaKota dan mengisi value untuk parameter
    //printCuacaKota("Ankara", 27, 31, 82)
    //printCuacaKota("Tokyo", 32, 36, 10)
    //printCuacaKota("Cape Town", 59, 64, 2)
    //printCuacaKota("Guatemala City", 50, 55, 7)
//}

//fun printCuacaKota(namaKota: String, lowTemp: Int, highTemp: Int, curahHujan: Int) { //TODO: Function mengeprint cuaca kota-kota di function main dengan parameter nama kota, temperatur rendah, temperatur tertinggi, dan kemungkinan curah hujan
    //println("Kota: $namaKota")
    //println("Temperatur terendah: $lowTemp, Temperatur Tertinggi: $highTemp")
    //println("Kemungkinan hujan: $curahHujan%")
    //println()
//}