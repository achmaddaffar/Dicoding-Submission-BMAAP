package com.example.pesenkuy

object OrderData {
    private val orderNames = arrayOf(
        "Pecel",
        "Rujak",
        "Papeda",
        "Soto",
        "Gulai Daging Sapi",
        "Rendang",
        "Kolak",
        "Kari",
        "Nasi Goreng",
        "Bakso"
    )

    private val orderDetails = arrayOf(
        "Pecel merupakan makanan yang terdiri dari sayur yang direbus dan lauk yang dihidangkan dengan alas yang berbeda-beda sesuai kota asal pecel, misalnya piring lidi yang disebut ingke, pincuk, atau tampah bambu. Sayuran yang dihidangkan antara lain kacang panjang, taoge, mentimun, daun singkong, dan daun kemangi akan tetapi variasi sayuran yang digunakan juga beragam berdasarkan daerah dan keanekaragaman sayuran yang tersedia pada musim dan wilayah tersebut. Bumbu sambal kacang yang disiramkan di atas pecel disebut sambal pecel yang terbuat dari campuran kencur, gula merah, garam, cabai, kecombrang, daun jeruk purut, dan kacang tanah sangrai yang dicampur, ditumbuk, atau diulek. Selain itu, ada pula yang menambahkan daun bawang dan asam jawa ke dalam campuran air hangat untuk mencairkan sambal pecel. Pada daerah tertentu, bumbu pecel diberi campuran ubi jalar untuk menambah kekentalan dan tekstur dari bumbu pecel tersebut. Variasi lain dapat yang dapat ditemukan adalah penambahan sambal tumpang pada bumbu. Pecel dapat dikonsumsi dengan nasi maupun dengan mie dan pada beberapa daerah pecel dikonsumsi dengan sayur kuah santan dan sambal goreng.",
        "Rujak adalah hidangan salad buah dan sayuran tradisional Jawa, Indonesia, yang umumnya dapat ditemukan di Indonesia, Malaysia, dan Singapura. Selain mengacu pada hidangan salad buah ini, istilah rujak juga berarti \"campuran\" atau \"campuran eklektik\" dalam bahasa Melayu sehari-hari.\n" +
                "\n" +
                "Rujak bisa ditemukan di semua daerah di seluruh Indonesia, dan ada banyak variasi di dalam negeri. Varian rujak yang paling populer adalah rujak buah, yang merupakan campuran irisan buah dan sayuran yang disajikan dengan saus gula aren pedas. Tidak seperti salad buah pada umumnya, rujak sering digambarkan sebagai salad buah yang tajam dan pedas karena sausnya yang manis dan pedas, yang terbuat dari cabai, gula aren, dan kacang tanah. Rujak juga merupakan makanan jalanan yang populer di Bali.",
        "Papeda adalah makanan berupa bubur sagu khas Maluku dan Papua yang biasanya disajikan dengan ikan tongkol atau mubara yang dibumbui dengan kunyit. Papeda berwarna putih dan bertekstur lengket menyerupai lem dengan rasa yang tawar. Papeda merupakan makanan yang kaya serat, rendah kolesterol, dan cukup bernutrisi."
                + "\n\nDi berbagai wilayah pesisir dan dataran rendah di Papua, sagu merupakan bahan dasar dalam berbagai makanan. Sagu bakar, sagu lempeng, dan sagu bola menjadi sajian yang paling banyak dikenal di berbagai pelosok Papua, khususnya dalam tradisi kuliner masyarakat adat di Kabupaten Mappi, Asmat, hingga Mimika. Papeda merupakan salah satu sajian khas sagu yang jarang ditemukan. Antropolog sekaligus Ketua Lembaga Riset Papua, Johszua Robert Mansoben, menyatakan bahwa papeda dikenal lebih luas dalam tradisi masyarakat adat Sentani dan Abrab di Danau Sentani dan Arso, serta Manokwari.",
        "Soto, sroto, sauto, tauto, atau coto adalah makanan khas Indonesia seperti sop yang terbuat dari kaldu daging dan sayuran. Daging yang paling sering digunakan adalah daging sapi dan daging ayam, tetapi ada pula yang menggunakan daging babi atau daging kambing. Berbagai daerah di Indonesia memiliki soto khas daerahnya masing-masing dengan komposisi yang berbeda-beda, misalnya Soto Madura, Soto Kediri, Soto Pemalang, Soto Lamongan, Soto Jepara, Soto Semarang, Soto Kudus, Soto Betawi, Soto Padang, Soto Bandung, Sauto Tegal Tauto Pekalongan, Sroto Sokaraja, Sroto Kriyik, Sroto Bancar, Soto Banjar, Soto Medan, dan Coto Makassar. Soto juga diberi nama sesuai isinya, misalnya Soto ayam, Soto babat, atau Soto kambing. Ada pula soto yang dibuat dari daging kaki sapi yang disebut dengan soto sekengkel.\n" +
                "\n" +
                "Cara penyajian soto berbeda-beda sesuai dengan khas di setiap daerah. Soto biasa dihidangkan dengan nasi, lontong, ketupat, mie, atau bihun. Untuk menambah cita rasa dan kelezatan, biasanya disertai dengan berbagai macam pelengkap, misalnya kerupuk, perkedel, emping, sambal, dan sambal kacang. Ada juga yang menambahkan telur puyuh, sate kerang, jeruk limau, berbagai macam gorengan (tempe, tahu, bakwan), bawang goreng, seledri, tauco, dan koya.",
        "Gulai disebut juga sebagai Gule adalah Masakan Indonesia berbahan baku daging ayam, aneka ikan, kambing, sapi, jeroan, atau sayuran seperti nangka muda dan daun singkong, yang diolah dalam kuah bumbu rempah yang bercita rasa gurih yang berasal dari Sumatera, Indonesia. Ciri khas gulai adalah bumbunya yang kaya rempah antara lain kunyit, ketumbar, lada, lengkuas, jahe, cabai merah, bawang merah, bawang putih, adas, pala, serai, kayu manis dan jintan yang dihaluskan, dicampur, kemudian dimasak dalam santan. Masakan ini yang memiliki ciri khas berwarna kuning karena pengaruh sari kunyit. Makanan ini dianggap sebagai bentuk lain dari kari, dan secara internasional sering disebut sebagai kari ala Indonesia, meskipun dalam seni kuliner Indonesia juga ditemukan kari.",
        "Rendang atau randang dalam bahasa Minangkabau (Jawi: رندڠ) adalah Masakan Minangkabau yang berbahan dasar daging yang berasal dari Sumatera Barat, Indonesia. Masakan ini dihasilkan dari proses memasak suhu rendah dalam waktu lama dengan menggunakan aneka rempah-rempah dan santan. Proses memasaknya memakan waktu berjam-jam (biasanya sekitar empat jam) hingga yang tinggal hanyalah potongan daging berwarna hitam pekat dan dedak. Dalam suhu ruangan, rendang dapat bertahan hingga berminggu-minggu. Rendang yang dimasak dalam waktu yang lebih singkat dan santannya belum mengering disebut kalio, berwarna cokelat terang keemasan.\n" +
                "\n" +
                "Rendang dapat dijumpai di Rumah Makan Padang di seluruh dunia. Masakan ini populer di Indonesia dan negara-negara Asia Tenggara lainnya, seperti Malaysia, Singapura, Brunei, Filipina dan Thailand. Di daerah asalnya, Minangkabau, rendang disajikan di berbagai upacara adat dan perhelatan istimewa. Meskipun rendang merupakan masakan tradisional Minangkabau, teknik memasak serta pilihan dan penggunaan bumbu rendang berbeda-beda menurut daerah.",
        "Kolak (atau kolek) adalah makanan penutup khas Indonesia yang berbahan dasar gula aren atau gula kelapa, santan, dan daun pandan (P. amaryllifolius). Kolak memiliki rasa yang gurih dan manis dan tekstur yang lembut. Kolak biasanya disajikan hangat, namun bisa juga disajikan dingin dengan ditambah es batu sehingga menjadi es kolak. Meski saat ini sudah dapat ditemui di mana saja, namun kolak sejatinya berasal dari Sumatera Barat.\n" +
                "\n" +
                "Di Indonesia, kolak merupakan hidangan yang disukai masyarakat sebagai salah satu menu berbuka puasa di bulan Ramadhan. Pada bulan tersebut, penjual makanan musiman yang menjual kolak dapat dengan mudah ditemukan di pinggir jalan raya perkotaan. Selain buah pisang, kolak biji salak juga kerap ditemui saat bulan Ramadhan. Kolak biji salak terbuat dari ubi jalar yang dibentuk bulat, lalu dicampur dengan tepung tapioka.",
        "Kari atau yang dikenal di Indonesia sebagai kare adalah nama untuk berbagai jenis hidangan berkuah yang dimasak dengan rempah-rempah hingga mempunyai cita rasa tajam dan pedas. Kari berasal Asia Selatan, terutama dari India yang telah meluas ke seluruh negara di kawasan Asia Pasifik dan Eropa.\n" +
                "\n" +
                "Bumbu dan rempah-rempah yang digunakan untuk membuat kari sangat beragam dan tidak terbatas pada ketumbar, kunyit, merica, cabai, bubuk paprika, jintan, kayu manis, kapulaga, bunga lawang, kelabet, adas manis, daun salam koja, dan cengkih. Jenis rempah-rempah yang digunakan bergantung jenis kari dan negara asal masakan. Bubuk kari (curry powder) atau masala adalah campuran dari berbagai jenis bumbu dan rempah yang pertama kali dibuat oleh orang Inggris pada zaman Kemaharajaan Britania karena rindu dengan kari India.\n" +
                "\n" +
                "Dalam bahasa-bahasa Dravida, kari berarti sayuran dalam saus atau saus. Kata kerja karughi dalam bahasa Tamil berarti menggoreng dengan minyak banyak (atau membakar). Dalam bahasa Kannada, kari juga menggoreng atau hidangan gorengan. Dalam sebagian bahasa-bahasa India Selatan, kari secara harfiah berarti lauk (berbagai macam masakan sayuran dan daging) yang dimakan bersama nasi atau roti. Di negara-negara Barat, curry telah menjadi kosakata bahasa Inggris untuk semua jenis masakan khas Asia Selatan dan Asia Tenggara yang dimasak dengan berbagai rempah-rempah.",
        "Nasi goreng merupakan sajian nasi yang digoreng dalam sebuah wajan atau penggorengan menghasilkan cita rasa berbeda karena dicampur dengan bumbu-bumbu seperti garam, bawang putih, bawang merah, merica dan kecap manis. Selain itu, ditambahkan bahan-bahan pelengkap seperti telur, sayur-sayuran, makanan laut, atau daging. Makanan tersebut sering kali disantap sendiri atau disertai dengan hidangan lainnya. Nasi goreng adalah komponen populer dari masakan Asia Timur, Tenggara dan Selatan pada wilayah tertentu. Sebagai hidangan buatan rumah, nasi goreng biasanya dibuat dengan bahan-bahan yang tersisa dari hidangan lainnya, yang berujung pada ragam yang tak terbatas. Menjadi penopang ekonomi, hal yang sama juga terjadi pada mi goreng atau pyttipanna.\n" +
                "\n" +
                "Beberapa ragam populer dari nasi goreng memiliki daftar bahan spesifik mereka sendiri. Di Tiongkok Raya, ragam paling terkenal meliputi nasi goreng Yangzhou dan nasi goreng Hokkien. Chāhan Jepang dianggap sebuah hidangan Tionghoa Jepang, yang berasal dari hidangan nasi goreng Tionghoa. Bokkeum-bap dari Korea umumnya tak dianggap demikian, meskipun terdapat ragam Tionghoa Korea dari bokkeum-bap. Di Asia Tenggara, nasi goreng Indonesia, Malaysia, dan Singapura yang berkonstruksi serupa dan khao phat Thai adalah hidangan populer. Di Barat, kebanyakan restoran untuk pelanggan vegetarian atau Muslim membuat ragam mereka sendiri dari nasi goreng, termasuk nasi goreng telur. Nasi goreng juga muncul pada menu-menu restoran Amerika yang menawarkan masakan dengan tanpa tradisi asli dari hidangan tersebut. Selain itu, terdapat ragam nasi goreng di negara-negara selatan Amerika Serikat. Beberapa ragam tersebut meliputi chaulafan asal Ekuador, arroz chaufa asal Peru, arroz frito asal Kuba, dan arroz mamposteao asal Puerto Rico.",
        "Bakso atau baso adalah jenis bola daging yang lazim ditemukan pada masakan Indonesia. Bakso umumnya dibuat dari campuran daging sapi giling dan tepung tapioka, tetapi ada juga bakso yang terbuat dari daging ayam, ikan, atau udang bahkan daging kerbau. Dalam penyajiannya, bakso umumnya disajikan panas-panas dengan kuah kaldu sapi bening, dicampur mi, bihun, taoge, tahu, terkadang telur lalu ditaburi bawang goreng dan seledri. Bakso sangat populer dan dapat ditemukan di seluruh Indonesia, dari gerobak pedagang kaki lima hingga restoran besar. Berbagai jenis bakso sekarang banyak ditawarkan dalam bentuk makanan beku yang dijual di pasar swalayan ataupun mal-mal. Irisan bakso dapat juga dijadikan pelengkap jenis makanan lain seperti mi goreng, nasi goreng, sop atau capcai."
    )

    private val orderImages = intArrayOf(
        R.drawable.pecel,
        R.drawable.rujak,
        R.drawable.papeda,
        R.drawable.soto,
        R.drawable.gulaidagingsapi,
        R.drawable.rendang,
        R.drawable.kolak,
        R.drawable.kari,
        R.drawable.nasigoreng,
        R.drawable.bakso
    )

    private val orderPrices = doubleArrayOf(
        14000.0,
        12000.0,
        16000.0,
        15000.0,
        18000.0,
        21000.0,
        15000.0,
        16000.0,
        14000.0,
        15000.0
    )

    private val orderTags = arrayOf(
        ": Sayuran, Pedas",
        ": Buah-buahan, Sayuran, Manis, Pedas",
        ": Bubur, Ikan",
        ": Daging, Sayuran, Pedas",
        ": Daging Sapi, Gurih",
        ": Daging Sapi, Gurih",
        ": Manis, Buah-buahan, Hangat & Dingin",
        ": Daging, Tahu, Gurih",
        ": Gurih, Daging, Sayur-sayuran",
        ": Daging, Gurih, Sayuran"
    )

    private val orderCalories = arrayOf(
        ": 276 kkal / 120 gram",
        ": 243 kkal / 200 gram",
        ": 209 kkal / 100 gram",
        ": 569.3 kkal / 100 gram",
        ": 410 kkal / 100 gram",
        ": 193 kkal / 100 gram",
        ": 163 kkal / 100 gram",
        ": 325 kkal / 100 gram",
        ": 163 kkal / 100 gram",
        ": 196,9 kkal / 100 gram"
    )

    val listData: ArrayList<Order> get() {
        val list = arrayListOf<Order>()
        for (index in orderNames.indices) {
            val order = Order()
            order.name = orderNames[index]
            order.detail = orderDetails[index]
            order.photo = orderImages[index]
            order.price = orderPrices[index]
            order.tag = orderTags[index]
            order.calorie = orderCalories[index]
            list.add(order)
        }
        return list
    }
}