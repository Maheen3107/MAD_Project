package com.example.instagram_clone

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView

class ImageAdapter(private val context: Context, private var imageIds: Array<Int>) : BaseAdapter() {

    // Returns the number of images
    override fun getCount(): Int {
        return imageIds.size
    }

    // Returns the image at a particular position
    override fun getItem(position: Int): Any {
        return imageIds[position]
    }

    // Returns the image ID at a particular position (not used here)
    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    // Inflates the layout for each grid item and sets the image
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View
        val viewHolder: ViewHolder

        if (convertView == null) {
            // Inflate the layout for the grid item
            view = LayoutInflater.from(context).inflate(R.layout.grid_item, parent, false)
            viewHolder = ViewHolder()
            viewHolder.imageView = view.findViewById(R.id.gridImageView)
            view.tag = viewHolder
        } else {
            view = convertView
            viewHolder = view.tag as ViewHolder
        }

        // Set the image resource for the ImageView
        viewHolder.imageView?.setImageResource(imageIds[position])

        return view
    }

    // Method to update the image list and refresh the GridView
    fun updateImages(newImageIds: Array<Int>) {
        imageIds = newImageIds
        notifyDataSetChanged()  // Refresh the GridView to reflect the updated image list
    }

    // ViewHolder class to improve performance by avoiding repeated calls to findViewById
    private class ViewHolder {
        var imageView: ImageView? = null
    }
}
