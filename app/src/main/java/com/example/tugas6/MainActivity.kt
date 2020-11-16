package com.example.tugas6
import android.content.Intent
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val testData = createData()
        rv_parts.layoutManager = LinearLayoutManager(this)
        rv_parts.setHasFixedSize(true)
        rv_parts.adapter = Adapter(testData, { Item : Data -> ItemClicked(Item)})
    }
    private fun ItemClicked(Item : Data) {
        val showDetailActivityIntent = Intent(this, DetailActivity::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT,Item.gambar)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TITLE,Item.nama)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE,Item.deskripsi)
        startActivity(showDetailActivityIntent)
    }
    private fun createData() : List<Data> {
        val partList = ArrayList<Data>()
        partList.add(Data(R.drawable.tako,"Takoyaki Rice Crispy" , "Takoyaki Pak Totok - Lapangan Kodam, Surabaya \n" + "\n" +
                "Takoyaki merupakan street food khas Jepang berbentuk bola-bola kecil yang diisi dengan potongan gurita.\n" +
                "Di Surabaya, traveler bisa mencicipi takoyaki dengan isian rice crispy yang gurih.\n" +
                 "\n" +
                "Takoyaki unik ini dibanderol dengan harga Rp 10 ribu (isi 4) dan Rp 12 ribu (isi 5).\n"))
        partList.add(Data(R.drawable.cumi,"Sate Cumi Bakar", "Lapangan Kodam, Surabaya \n" + "\n" +"Cumi-cumi yang digoreng tepung dan dimasak dengan saus asam manis memang sudah biasa.\n" +
                "Bagaimana dengan cumi-cumi yang dibakar layaknya sate?\n" + "\n" +
                "Dengan Rp 15 ribu, traveler bisa mencicipi sate cumi bakar di Surabaya.\n"))
        partList.add(Data(R.drawable.bakso, "Bakso Kwetiauw", "Bakso Kwetiau Dharmawangsa - Jl. Dharmawangsa no.142, Surabaya\n"+ "\n" + "Apa rasanya bakso yang disajikan dengan kwetiauw?\n" +
                "Di Surabaya traveler bisa mencicipi bakso dengan isian bakso, pangsit goreng, tahu, dan kwetiauw.\n" +
                "\n" +
                "Harganya mulai Rp 10 ribu hingga Rp 20 ribu."))
        partList.add(Data(R.drawable.mix,"Mix Odeng Tokkochi", "Royal Plaza Surabaya Lantai 3\n" +
                "\n" +
                "Odeng merupakan kudapan khas Korea Selatan yang berupa ikan rebus.\n" +
                "Nah, traveler bisa mencicipi odeng di Surabaya.\n" +
                "\n" +
                "Harganya cuma Rp 18 ribu."))
        partList.add(Data(R.drawable.pentol,"Pentol Jumbo", "Pentol Spesial Rasa - Jl. Nginden Semolo, Surabaya\n" +
                "\n" +
                "Jika pentol biasanya berukuran kecil, di Surabaya ada pentol dengan ukuran jumbo.\n" +
                "Uniknya terdapat beragam jenis pentol, mulai dari pentol jumbo, pentol cabe, pentol jamur, pentol keju, pentol puyuh, dna pentol urat.\n" +
                "\n" +
                "Harganya mulai Rp 500 hingga Rp 2 ribu."))
        partList.add(Data(R.drawable.pok,"Pok - Pok", "Saat ini Pok-pok memiliki banyak cabang di Surabaya, antara lain Food Court Tunjungan Plaza 1 Lt. 5, Surabaya, Pakuwon Trade Center Lt. LG, Surabaya Food Junction Grand Pakuwon, Surabaya, Royal Plaza Lt. 3, Surabaya, Food Court City of Tomorrow, Surabaya dan masih banyak lagi.\n" +
                "\n" +
                "Ayam goreng khas Taiwan yang garing dan pipih juga ada di Surabaya. Jajanan ini memiliki tekstur yang garing di luar dan lembut di dalam karena daging ayamnya. Daging ayam yang dipilih adalah bagian daging dada.\n" +
                "Daging ayam dipipihkan sehingga menjadi sangat tipis lalu dilumuri dengan tepung terigu. Setelah itu dimasak dengan teknik deep fried hingga warnanya menjadi cokelat keemasan. Setelah itu ayam akan terlihat sangat garing, lalu dipotong-potong dan diberi taburan bumbu perasa. Terdapat rasa bbq, bawang putih, keju, pedas, rumput laut dan masih banyak lagi.\n" +
                "\n" +
                "Tidak hanya dada, pengunjung bisa mencoba varian dari cumi, kentang goreng, ayam karage, dan kulit ayam. Pok-pok juga menghadirkan onion ring, mi kremes dan tahu goreng krispi. Untuk harganya dimulai dari Rp 10.000.\n" ))
        partList.add(Data(R.drawable.pok,"Cakue Peneleh", "Pasar Atom Lt. Dasar, tahap 3.\n" +
                "\n" +
                "Di Surabaya terdapat satu toko yang menjual cakue dengan rasa yang nikmat dan tidak pernah sepi pengunjung. Cakue Peneleh buka sejak 30 tahun lalu, " +
                "awalnya menawarkan cakwe biasa. Cakue dari toko ini memiliki tekstur yang garing di luar tetapi lembut di dalam. Selain cakue polos, " +
                "pengunjung juga ditawarkan cakue isi udang yang khas dari Cakue Peneleh. Cakue isi udanya tidak panjang, namun hanya seukuran jari telunjuk " +
                "orang dewasa. Cakue dibelah menjadi dua dan ditengahnya diberi adonana udang, tepung, dan sayuran yang sudah dipotong kecil-kecil. " +
                " Apa Isinya? Cakue isi disajikan dengan saus tomat bening yang memiliki rasa, asam, sedikit pedas dan segar. Selain cakue pengunjung juga bisa menikmati " +
                "jajanan lainnya seperti roti manis, ote-ote, aneka kompiang dan masih banyak lagi. \n" + "\n" +
                "Satu cakue polos dihargai sebesar Rp 5.000 rupiah sedangkan cakue isi Rp 6.000. Cakue Peneleh terletak di Pasar Atum lantai dasar Tahap 3 dan Pakuwon Trade Center lantai UG stand E1-21. Sampai di depan toko Cakue Peneleh di Pasar Atom " +
                "kamu harus cekatan untuk memesan cakue atau jajanan. Sebab pengunjung akan terus datang dan mengantre di belakanmu. Toko cakue ini" +
                " memperlihatkan proses memasak cakuenya secara langsung. Dapurnya dibatasi dengan kaca sehingga pengunjung bisa melihat bagaimana adonan cakue " +
                "dibuat hingga digoreng.\n"
        ))

        return partList
    }
}
