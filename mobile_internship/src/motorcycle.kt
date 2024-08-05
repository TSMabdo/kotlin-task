class motorcycle(make: String,model: String,val horsepower:Int):vehicle(make,model){
    override fun displayinfo() {
        super.displayinfo()
        println("the horsepower = $horsepower")
    }
}