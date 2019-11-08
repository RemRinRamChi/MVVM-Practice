package com.yawjenn.mvvmpractice.posts

import androidx.recyclerview.widget.DiffUtil
import com.yawjenn.mvvmpractice.data.Post

class PostListDiffCallback(private val _oldPosts: List<Post>, private val _newPosts: List<Post>): DiffUtil.Callback() {

    override fun getOldListSize(): Int = _oldPosts.size

    override fun getNewListSize(): Int = _newPosts.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean
            = _oldPosts[oldItemPosition].id == _newPosts[newItemPosition].id

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean
            = _oldPosts[oldItemPosition] == _newPosts[newItemPosition]
}