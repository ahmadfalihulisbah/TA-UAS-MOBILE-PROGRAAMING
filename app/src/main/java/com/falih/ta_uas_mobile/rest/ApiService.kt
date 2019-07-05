package com.falih.ta_uas_mobile.rest

import com.falih.ta_uas_mobile.BuildConfig
import com.falih.ta_uas_mobile.model.RootDataModel
import retrofit.http.GET
import rx.Observable
import java.util.*

interface ApiService {
    // http://informatika.upgris.ac.id/mobile/data/index.php/api/example/detil_jadwal?key=33c227f799464dac08f60f1b0d5770&npm=16670066
    @GET("detil_jadwal?key=" + BuildConfig.API_KEY + "&npm=" + BuildConfig.NPM)
    fun getJadwalKuliah(
    ): Observable<RootDataModel>

    @GET("detil_pribadi?key=" + BuildConfig.API_KEY + "&npm=" + BuildConfig.NPM)
    fun getProfil(
    ): Observable<RootDataModel>

}