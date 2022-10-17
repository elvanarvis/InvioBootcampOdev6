package com.bootcamp.inviobootcampodev6

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bootcamp.inviobootcampodev6.databinding.CardViewBinding


class TweetAdapter(var mContext: Context, var tweetListesi: List<Tweet>) :
    RecyclerView.Adapter<TweetAdapter.CardView>() {

    inner class CardView(binding: CardViewBinding) : RecyclerView.ViewHolder(binding.root) {
        var binding: CardViewBinding

        init {
            this.binding = binding
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardView {

        val binding = CardViewBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return CardView(binding)

    }

    override fun onBindViewHolder(holder: CardView, position: Int) {
        val tweet = tweetListesi.get(position)
        val t = holder.binding

        t.apply {

            tvName.text = tweet.name
            tvNickname.text = tweet.nickName
            tvTime.text = tweet.time
            tvParagraf.text = tweet.paragraf
            tvLike.text = tweet.kalp
            tvRetweet.text = tweet.retweet
            tvYorum.text = tweet.yorum

            ivProfilFoto.setImageResource(
                mContext.resources.getIdentifier(
                    tweet.profilFoto, "drawable", mContext.packageName
                )
            )

            if (tweet.fotoVarMı == false)
                ivTimage.visibility = View.GONE
            else{
                ivTimage.setImageResource(
                    mContext.resources.getIdentifier(
                        tweet.foto,"drawable", mContext.packageName
                    )
                )
            }

            if(tweet.profTik == false)
                ivTik.visibility = View.GONE

            
        }
    }

    override fun getItemCount() = tweetListesi.size

}