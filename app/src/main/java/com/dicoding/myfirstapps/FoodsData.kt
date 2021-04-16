package com.dicoding.myfirstapps

object FoodsData {
    private val foodNames = arrayOf ("Telur Ceplok",
        "Kwetiau",
        "Kue",
        "Burger",
        "Es Leci",
        "Donat",
        "Blueberry",
        "Jeruk",
        "Es Krim",
        "Es Krim Cone")

    private val foodDetails = arrayOf ("Sarapan yang sering saya santap ketika pagi hari sebelum memulai kegiatan",
        "Makanan favorite saya sejak kecil karena keunikan rasanya membuat saya teringat akan masa kecil",
        "Salah satu jajanan kesukaan saya, semua aneka kue saya suka apalagi kue gratisan rasanya makin mantap",
        "Burger adalah sejenis makanan berupa roti berbentuk bundar yang diiris dua dan di tengahnya diisi dengan patty,sayur-sayuran berupa selada, tomat dan bawang bombay.",
        "Minuman penyegar yang cocok diminum pada siang hari yang terik, terasa segar dimulut dan dihati serta sensasi melegakan",
        "Donat adalah jajanan yang dibuat dengan cara digoreng dari adonan tepung terigu, gula, telur, dan mentega",
        "Blueberry adalah buah berbentuk bola kecil nan kaya manfaat utamanya dikenal sebagai buah dengan antioksidan yang tinggi.",
        "Buah jeruk berbentuk bulat atau lonjong dan dipangkalnya terdapat tangkai buah yang pendek",
        "Es krim merupakan produk olahan susu yang dibuat dengan cara membekukan dan mencampur bahan baku secara bersama-sama.",
        "Es krim cone merupakan produk olahan susu yang dibuat dengan cara membekukan dan mencampur bahan baku secara bersama-sama dan menggunakan cone sebagai wadahnya")

    private val foodsImages = intArrayOf(R.drawable.telur_ceplok,
        R.drawable.kwetiau,
        R.drawable.kue,
        R.drawable.burger,
        R.drawable.es_leci,
        R.drawable.donat,
        R.drawable.blueberry,
        R.drawable.jeruk,
        R.drawable.es_krim,
        R.drawable.es_krim_pocong)

    val listData: ArrayList<Food>
        get() {
            val list = arrayListOf<Food>()
            for (position in foodNames.indices) {
                val food = Food()
                food.name = foodNames[position]
                food.detail = foodDetails[position]
                food.photo = foodsImages[position]
                list.add(food)
            }
            return list
        }
}