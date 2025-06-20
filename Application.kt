package ru.dungeongg.kotlintask2

import ru.dungeongg.kotlintask2.service.XmlParserService

fun main() {
    val xml = """
        <students>
            <student>
                <first_name>Viacheslav</first_name>
                <second_name>Ivanov</second_name>
                <skills>
                    <skill hard="true">Java</skill>
                    <skill hard="true">Kotlin</skill>
                    <skill hard="true">DevSecOps</skill>
                    <skill soft="true">English language</skill>
                </skills>
            </student>
            <student>
                <first_name>Peter</first_name>
                <second_name>Sergeev</second_name>
                <skills>
                    <skill hard="true">PHP</skill>
                    <skill hard="true">Backend</skill>
                </skills>
            </student>
            <student>
                <first_name>Maria</first_name>
                <second_name>Gavrilovich</second_name>
                <skills>
                    <skill hard="true">Project manager</skill>
                    <skill soft="true">Speaking</skill>
                </skills>
            </student>
        </students>
    """.trimIndent()

    val parserService = XmlParserService()
    val students = parserService.parseStudents(xml)

    students.forEach { student ->
        println("Студент: ${student.firstName} ${student.secondName}")
        student.skills.skillList.forEach { skill ->
            val type = if (skill.hard) "hard" else if (skill.soft) "soft" else "unknown"
            println("  Навык: ${skill.value} ($type)")
        }
    }
}
