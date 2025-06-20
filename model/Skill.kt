package ru.dungeongg.kotlintask2.model

import javax.xml.bind.annotation.*

@XmlAccessorType(XmlAccessType.FIELD)
class Skill {
    @XmlAttribute(name = "hard")
    var hard: Boolean = false

    @XmlAttribute(name = "soft")
    var soft: Boolean = false

    @XmlValue
    lateinit var value: String
}
