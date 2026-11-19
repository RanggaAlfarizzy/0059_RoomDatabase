package com.example.pertemuan9.view.route

import com.example.pertemuan9.R

object DestinasiDetailSiswa : DestinasiNavigasi {
    override val route = "item_edit"
    override val titleRes = R.string.detail_siswa
    const val itemIdArg = "idSiswa"
    val routeWithArgs = "$route/{$itemIdArg}"
}