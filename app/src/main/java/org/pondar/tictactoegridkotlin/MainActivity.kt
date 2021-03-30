package org.pondar.tictactoegridkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {


    var turn = 1
    var counter = 0
    private var state = IntArray(9)

    val EMPTY = 0
    val CROSS = 1
    val BOLLE = 2


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //we add clicklisteners, this, to all our fields
        table.setOnClickListener(this)
        field0.setOnClickListener(this)
        field1.setOnClickListener(this)
        field2.setOnClickListener(this)
        field3.setOnClickListener(this)
        field4.setOnClickListener(this)
        field5.setOnClickListener(this)
        field6.setOnClickListener(this)
        field7.setOnClickListener(this)
        field8.setOnClickListener(this)

        state[0] = 0

        state[0] = EMPTY
        state[1] = EMPTY
        state[2] = EMPTY
        state[3] = EMPTY
        state[4] = EMPTY
        state[5] = EMPTY
        state[6] = EMPTY
        state[7] = EMPTY
        state[8] = EMPTY

        button.setOnClickListener {
            restartGame()
            Toast.makeText(applicationContext, "The game has been reset", Toast.LENGTH_SHORT).show()
        }

    }

    override fun onClick(view: View?) {
        if (view?.id == R.id.field0) {
            val image = view as ImageView
            Log.d("Field_Clicked", "field 0 pressed")
            if (state[0] == 0) {
                if (turn == 1) {
                    image.setImageResource(R.drawable.kryds)
                    turn = 0
                    state[0] = CROSS
                } else if (turn == 0) {
                    image.setImageResource(R.drawable.bolle)
                    turn = 1
                    state[0] = BOLLE
                }
            }
            counter++
            checkWinner()
        } else if (view?.id == R.id.field1) {
            val image = view as ImageView
            Log.d("Field_Clicked", "field 1 pressed")
            if (state[1] == 0) {
                if (turn == 1) {
                    image.setImageResource(R.drawable.kryds)
                    turn = 0
                    state[1] = CROSS
                } else if (turn == 0) {
                    image.setImageResource(R.drawable.bolle)
                    turn = 1
                    state[1] = BOLLE
                }
            }
            counter++
            checkWinner()
        } else if (view?.id == R.id.field2) {
            val image = view as ImageView

            Log.d("Field_Clicked", "field 2 pressed")

            if (state[2] == 0) {
                if (turn == 1) {
                    image.setImageResource(R.drawable.kryds)
                    turn = 0
                    state[2] = CROSS
                } else if (turn == 0) {
                    image.setImageResource(R.drawable.bolle)
                    turn = 1
                    state[2] = BOLLE
                }
            }
            counter++
            checkWinner()
        } else if (view?.id == R.id.field3) {
            val image = view as ImageView

            Log.d("Field_Clicked", "field 3 pressed")

            if (state[3] == 0) {
                if (turn == 1) {
                    image.setImageResource(R.drawable.kryds)
                    turn = 0
                    state[3] = CROSS
                } else if (turn == 0) {
                    image.setImageResource(R.drawable.bolle)
                    turn = 1
                    state[3] = BOLLE
                }
            }
            counter++
            checkWinner()
        } else if (view?.id == R.id.field4) {
            val image = view as ImageView

            Log.d("Field_Clicked", "field 4 pressed")

            if (state[4] == 0) {
                if (turn == 1) {
                    image.setImageResource(R.drawable.kryds)
                    turn = 0
                    state[4] = CROSS
                } else if (turn == 0) {
                    image.setImageResource(R.drawable.bolle)
                    turn = 1
                    state[4] = BOLLE
                }
            }
            counter++
            checkWinner()
        } else if (view?.id == R.id.field5) {
            val image = view as ImageView

            Log.d("Field_Clicked", "field 5 pressed")

            if (state[5] == 0) {
                if (turn == 1) {
                    image.setImageResource(R.drawable.kryds)
                    turn = 0
                    state[5] = CROSS
                } else if (turn == 0) {
                    image.setImageResource(R.drawable.bolle)
                    turn = 1
                    state[5] = BOLLE
                }
            }
            counter++
            checkWinner()
        } else if (view?.id == R.id.field6) {
            val image = view as ImageView

            Log.d("Field_Clicked", "field 6 pressed")

            if (state[6] == 0) {
                if (turn == 1) {
                    image.setImageResource(R.drawable.kryds)
                    turn = 0
                    state[6] = CROSS
                } else if (turn == 0) {
                    image.setImageResource(R.drawable.bolle)
                    turn = 1
                    state[6]
                }
            }
            counter++
            checkWinner()
        } else if (view?.id == R.id.field7) {
            val image = view as ImageView

            Log.d("Field_Clicked", "field 7 pressed")

            if (state[7] == 0) {
                if (turn == 1) {
                    image.setImageResource(R.drawable.kryds)
                    turn = 0
                    state[7] = CROSS
                } else if (turn == 0) {
                    image.setImageResource(R.drawable.bolle)
                    turn = 1
                    state[7] = BOLLE
                }
            }
            counter++
            checkWinner()
        } else if (view?.id == R.id.field8) {
            val image = view as ImageView

            Log.d("Field_Clicked", "field 8 pressed")

            if (state[8] == 0) {
                if (turn == 1) {
                    image.setImageResource(R.drawable.kryds)
                    turn = 0
                    state[8] = CROSS
                } else if (turn == 0) {
                    image.setImageResource(R.drawable.bolle)
                    turn = 1
                    state[8] = BOLLE
                }
            }
            counter++
            checkWinner()
        }


    } //end of clicklistener

    fun restartGame() {
        counter = 0
        turn = 1
        state[0] = 0

        state[0] = EMPTY
        state[1] = EMPTY
        state[2] = EMPTY
        state[3] = EMPTY
        state[4] = EMPTY
        state[5] = EMPTY
        state[6] = EMPTY
        state[7] = EMPTY
        state[8] = EMPTY

        field0.setImageResource(R.drawable.blank)
        field1.setImageResource(R.drawable.blank)
        field2.setImageResource(R.drawable.blank)
        field3.setImageResource(R.drawable.blank)
        field4.setImageResource(R.drawable.blank)
        field5.setImageResource(R.drawable.blank)
        field6.setImageResource(R.drawable.blank)
        field7.setImageResource(R.drawable.blank)
        field8.setImageResource(R.drawable.blank)

    }

    fun checkWinner() {
        if (counter == 6) {
            if ((state[0] == 1) && (state[1] == 1) && (state[2] == 1)) {
                Toast.makeText(applicationContext, "X is the winner", Toast.LENGTH_SHORT).show()
            } else if ((state[3] == 1) && (state[4] == 1) && (state[5] == 1)) {
                Toast.makeText(applicationContext, "X is the winner", Toast.LENGTH_SHORT).show()
            } else if ((state[6] == 1) && (state[7] == 1) && (state[8] == 1)) {
                Toast.makeText(applicationContext, "X is the winner", Toast.LENGTH_SHORT).show()
            } else if ((state[0] == 1) && (state[3] == 1) && (state[6] == 1)) {
                Toast.makeText(applicationContext, "X is the winner", Toast.LENGTH_SHORT).show()
            } else if ((state[1] == 1) && (state[4] == 1) && (state[7] == 1)) {
                Toast.makeText(applicationContext, "X is the winner", Toast.LENGTH_SHORT).show()
            } else if ((state[2] == 1) && (state[5] == 1) && (state[8] == 1)) {
                Toast.makeText(applicationContext, "X is the winner", Toast.LENGTH_SHORT).show()
            } else if ((state[0] == 1) && (state[4] == 1) && (state[8] == 1)) {
                Toast.makeText(applicationContext, "X is the winner", Toast.LENGTH_SHORT).show()
            } else if ((state[2] == 1) && (state[4] == 1) && (state[6] == 1)) {
                Toast.makeText(applicationContext, "X is the winner", Toast.LENGTH_SHORT).show()
            } else if ((state[3] == 0) && (state[4] == 0) && (state[5] == 0)) {
                Toast.makeText(applicationContext, "O is the winner", Toast.LENGTH_SHORT).show()
            } else if ((state[6] == 0) && (state[7] == 0) && (state[8] == 0)) {
                Toast.makeText(applicationContext, "O is the winner", Toast.LENGTH_SHORT).show()
            } else if ((state[0] == 0) && (state[3] == 0) && (state[6] == 0)) {
                Toast.makeText(applicationContext, "O is the winner", Toast.LENGTH_SHORT).show()
            } else if ((state[1] == 0) && (state[4] == 0) && (state[7] == 0)) {
                Toast.makeText(applicationContext, "O is the winner", Toast.LENGTH_SHORT).show()
            } else if ((state[2] == 0) && (state[5] == 0) && (state[8] == 0)) {
                Toast.makeText(applicationContext, "O is the winner", Toast.LENGTH_SHORT).show()
            } else if ((state[0] == 0) && (state[4] == 0) && (state[8] == 0)) {
                Toast.makeText(applicationContext, "O is the winner", Toast.LENGTH_SHORT).show()
            } else if ((state[2] == 0) && (state[4] == 0) && (state[6] == 0)) {
                Toast.makeText(applicationContext, "O is the winner", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, "The game is over", Toast.LENGTH_SHORT).show()
                restartGame()
            }
        }

    }
}

