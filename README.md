# Dagger2Test2
inject data into application  
測試Dagger2 2.10版之前的實作方式，接續Dagger2Test

## 內容 ##
CarModule提供Car.class所需的class  
CarComponent提供注入CarModule的方法(Inject)  
Car透過builde之後系統產生的DaggerCarComponent注入所需要的class   
MainAppModule、MainAppComponent功能與CarModule、CarComponent相似，只差在是提供MainActivity需要的資料

## 結果 ##
在MainApp(Application)的onCreate中創建AppComponent後  
MainActivity跟MainApp要AppComponent並使用AppComponent.inject將資料(Car.class)注入   
Log會顯示創建的class  
