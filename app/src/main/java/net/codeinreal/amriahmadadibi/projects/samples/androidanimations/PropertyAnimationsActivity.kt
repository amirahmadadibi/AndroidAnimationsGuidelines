package net.codeinreal.amriahmadadibi.projects.samples.androidanimations

import android.animation.AnimatorInflater
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_property_animations.*

//Property Animations
//animate everything views or non-views
//Animator class -> ValueAnimator class
//ValueAnimator class changes or track values of an object over time
//with need to write the logic for applying animations
// x form 1 to 100 in 100.ms
//ValueAnimator class -> ObjectAnimator class, works automatic
//and we do'nt have to write our own logic
//Property animation with xml(res/animator) ro code
//screen starts at 0.0 form top and left. (x0 -> x+)&(y0 -^ y-)
//*** Type of properties
//Alpha, Scale, Translate, Rotate, Pivot, X, Y
//
class PropertyAnimationsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_property_animations)
    }


    fun scaleAnimation(view: View) {
        val scaleAnimator = AnimatorInflater.loadAnimator(this, R.animator.scale)
        scaleAnimator?.apply {
            setTarget(testImage)
            start()
        }
    }

    fun rotateAnimation(view: View) {

        val rotateAnimator = AnimatorInflater.loadAnimator(this, R.animator.rotate)
        rotateAnimator?.apply {
            setTarget(testImage)
            start()
        }
    }

    fun fadeAnimation(view: View) {

        val fadeAnimator = AnimatorInflater.loadAnimator(this, R.animator.alpha)
        fadeAnimator.setTarget(testImage)
        fadeAnimator.start()
    }

    fun translateAnimation(view: View) {

        val translateAnimator = AnimatorInflater.loadAnimator(this, R.animator.translate)
        translateAnimator.apply {
            setTarget(testImage)
            start()
        }

    }


}
