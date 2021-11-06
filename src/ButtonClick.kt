import java.awt.Button
import javax.management.ObjectInstance

class ButtonClick : AppCompatActivity(){
    lateinit var doneBtn:Button

    override fun onCreate(savedInstance: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_report)

        //this is lambda function which takes the view(button) and triggers onClick method
        doneBtn.setOnClickListener{
            //do whatever you want to do when button is clicked
            Toast.makeText(this@ButtonClick, "Its toast!", Toast.LENGTH_SHORT).show()

        }
    }
}