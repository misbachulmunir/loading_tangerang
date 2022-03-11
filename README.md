# loading_tangerang

penggunaan :
  import di gradle anda 

  allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  dan juga import :
  dependencies {
	        implementation 'com.github.misbachulmunir:loading_tangerang:1.0'//sesuaikan dengan versi
	}
  
  cara menggunakan
  java :
  inisialisasi :
  LoadingCustom loading = new LoadingCustom(context,true,true,R.drawable.chibi2);//drawable di isi sesaui selera
  
  untuk menampilkan
  loading.showDialog();
  
  untuk menutup
  loading.dismissDialog();
  
  jika ingin setcanselable ubah ke false; 
  LoadingCustom loading = new LoadingCustom(context,false,true,R.drawable.chibi2);
  
  ada juga loading bisa :
  inisialisasi :
  LoadingBiasa loading = new LoadingBiasa(context,true,true);
  loading.showDialog();
  loading.dismissDialog();
