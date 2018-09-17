# Picasso Library 
Picasso Android Library offers an easy way to download and caching images in your android app. Picasso Android Library is open source and widely used by android developers as their favorite image downloader in apps

## App Image

<p align="center">
  <img src="https://github.com/apppath/picassoappdemo/blob/master/picasso-home-activity.png"/>
</p>

```java

```

## Picasso Dependency
   Now open your project’s build.gradle from the project’s home directory and add the following dependency.
  
```build.gradle

implementation 'com.squareup.picasso:picasso:2.71828'

```

## ADAPTER DOWNLOADS
   Adapter re-use is automatically detected and the previous download canceled.

```java

@Override public void getView(int position, View convertView, ViewGroup parent) {
  SquaredImageView view = (SquaredImageView) convertView;
  if (view == null) {
    view = new SquaredImageView(context);
  }
  String url = getItem(position);

  Picasso.get().load(url).into(view);
}

```

## IMAGE TRANSFORMATIONS
   Transform images to better fit into layouts and to reduce memory size.
   
```java

Picasso.get()
  .load(url)
  .resize(50, 50)
  .centerCrop()
  .into(imageView)

```

You can also specify custom transformations for more advanced effects.

```java

public class CropSquareTransformation implements Transformation {
  @Override public Bitmap transform(Bitmap source) {
    int size = Math.min(source.getWidth(), source.getHeight());
    int x = (source.getWidth() - size) / 2;
    int y = (source.getHeight() - size) / 2;
    Bitmap result = Bitmap.createBitmap(source, x, y, size, size);
    if (result != source) {
      source.recycle();
    }
    return result;
  }

  @Override public String key() { return "square()"; }
}

```
Pass an instance of this class to the transform method.

## PLACE HOLDERS
   Picasso supports both download and error placeholders as optional features.
   
```java

Picasso.get()
    .load(url)
    .placeholder(R.drawable.user_placeholder)
    .error(R.drawable.user_placeholder_error)
    .into(imageView);

```
A request will be retried three times before the error placeholder is shown.

## RESOURCE LOADING
   Resources, assets, files, content providers are all supported as image sources.

```java

Picasso.get().load(R.drawable.landing_screen).into(imageView1);
Picasso.get().load("file:///android_asset/DvpvklR.png").into(imageView2);
Picasso.get().load(new File(...)).into(imageView3);

```

# Done Work
   
