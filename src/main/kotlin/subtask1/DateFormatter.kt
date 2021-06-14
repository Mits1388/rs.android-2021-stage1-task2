package subtask1

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {

            val dtf = DateTimeFormatter.ofPattern("dd MMMM, EEEE", Locale("ru"))
           return try {
                LocalDate.of(year.toInt(),month.toInt(),day.toInt()).format(dtf)
            } catch (e: Exception) {
               "Такого дня не существует"
            }

        }
    }

