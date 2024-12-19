package com.example.a2versionadapter.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.a2versionadapter.R
import com.example.a2versionadapter.model.TheTools


class AdapterTools(private var toolsAdapter: List<TheTools>) :
    RecyclerView.Adapter<AdapterTools.ToolsViewHolder>() {

    inner class ToolsViewHolder(private val toolsView: View) : RecyclerView.ViewHolder(toolsView) {
        fun bindi(theTools: TheTools) {
            toolsView.findViewById<TextView>(R.id.txtid).text = theTools.id
            toolsView.findViewById<TextView>(R.id.txtsector).text = theTools.sector
            toolsView.findViewById<TextView>(R.id.txtmanufacturer).text = theTools.manufacturer
            toolsView.findViewById<TextView>(R.id.txtsafe).text = theTools.safe
        }

        fun upnuewTools(newtools: List<TheTools>) {
            toolsAdapter = newtools
            notifyDataSetChanged()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ToolsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(

            R.layout.post_storetools,
            parent, false
        )
        return ToolsViewHolder(view)
    }

    override fun getItemCount(): Int = toolsAdapter.size

    override fun onBindViewHolder(holder: ToolsViewHolder, position: Int) {
        holder.bindi(toolsAdapter[position])
    }

}
