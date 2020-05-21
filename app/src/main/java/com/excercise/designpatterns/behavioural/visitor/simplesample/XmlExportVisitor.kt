package com.excercise.designpatterns.behavioural.visitor.simplesample

import android.util.Log

class XmlExportVisitor :
    Visitor {

    private val TAG = XmlExportVisitor::class.java.simpleName

    fun export(shape: MutableList<Shape>): String {
        val sb = StringBuilder()
        for (s in shape) {
            sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>" + "\n")
            sb.append(s.accept(this)).append("\n")
            println(sb.toString())
            sb.setLength(0)
        }
        return sb.toString()
    }

    override fun visit(d: Dot) {
        Log.d(TAG, "<dot>" + "\n" +
                "    <x>${d.x}</x>" + "\n" +
                "    <y>${d.y}</y>" + "\n" +
                "</dot>")
    }

    override fun visit(c: Circle) {
        Log.d(TAG, "<circle>\n" +
                            "<radius>${c.radius}</radius>\n" +
                        "</circle>")
    }

    override fun visit(r: Rectangle) {
        Log.d(TAG, "<rectangle>\n" +
                            "<width>${r.width}</width>\n" +
                            "<height>${r.height}</height>\n" +
                        "</rectangle>")
    }

    override fun visit(s: Square) {
        Log.d(TAG, "<square>\n" +
                            "</width>${s.width}</width>\n" +
                        "</square>")
    }
}