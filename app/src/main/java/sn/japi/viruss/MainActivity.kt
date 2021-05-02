package sn.japi.viruss

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //injecter le fragment dans notre boite (fragment_container)
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, AddFormulaire(this))
        transaction.addToBackStack(null)
        transaction.commit()
    }
}