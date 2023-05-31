package com.example.quizgame

object Constants {

    const val USER_NAME :String ="user_name"
    const val TOTAL_QUESTIONS :String ="total_questions"
    const val CORRECT_ANSWERS :String ="correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        //1
        val que1 = Question(
            1, "Đây là quốc kỳ của nước nào?",
            R.drawable.ic_flag_of_argentina,
            "Hoa kỳ", "Úc",
            "Argentina", "Pháp",
            3
        )
        questionsList.add(que1)

        //2
        val que2 = Question(
            2, "Đây là quốc kỳ của nước nào?",
            R.drawable.ic_flag_of_belgium,
            "Bỉ", "Úc",
            "Argentina", "Pháp",
            1
        )

        questionsList.add(que2)

        //3
        val que3 = Question(
            3, "Đây là quốc kỳ của nước nào?",
            R.drawable.ic_flag_of_brazil,
            "Hoa kỳ", "Úc",
            "Argentina", "Brazil",
            4
        )

        questionsList.add(que3)

        //4
        val que4 = Question(
            4, "Đây là quốc kỳ của nước nào?",
            R.drawable.ic_flag_of_australia,
            "Hoa kỳ", "Úc",
            "Argentina", "Brazil",
            2
        )

        questionsList.add(que4)

        //5
        val que5 = Question(
            5, "Đây là quốc kỳ của nước nào?",
            R.drawable.ic_flag_of_denmark,
            "Hoa kỳ", "Đan Mạch",
            "Argentina", "Brazil",
            2
        )

        questionsList.add(que5)

        //6
        val que6 = Question(
            6, "Đây là quốc kỳ của nước nào?",
            R.drawable.ic_flag_of_new_zealand,
            "Hoa kỳ", "Úc",
            "Argentina", "New Zealand",
            4
        )

        questionsList.add(que6)

        //7
        val que7 = Question(
            7, "Đây là quốc kỳ của nước nào?",
            R.drawable.ic_flag_of_fiji,
            "Hoa kỳ", "Fiji",
            "Argentina", "Brazil",
            2
        )

        questionsList.add(que7)

        //8
        val que8 = Question(
            8, "Đây là quốc kỳ của nước nào?",
            R.drawable.ic_flag_of_germany,
            "Bỉ", "Nhật Bản",
            "Hà Lan", "Đức",
            4
        )

        questionsList.add(que8)

        //9
        val que9 = Question(
            9, "Đây là quốc kỳ của nước nào?",
            R.drawable.ic_flag_of_india,
            "Ấn độ", "Nhật Bản",
            "Kuwait", "Nepal",
            1
        )

        questionsList.add(que9)

        //10
        val que10 = Question(
            10, "Đây là quốc kỳ của nước nào?",
            R.drawable.ic_flag_of_kuwait,
            "Bỉ", "Nhật Bản",
            "Kuwait", "Đức",
            3
        )

        questionsList.add(que10)

        return questionsList
    }
}