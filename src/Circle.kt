class Circle(private val x:Int,private val y:Int,private val radius:Int,private val drawAPI:DrawAPI) :Shape(drawAPI)  {
    override fun draw(){
        drawAPI.drawCircle(x,y,radius)
    }
}