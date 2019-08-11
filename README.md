# Information Unit - Standard Data Info

## Acknowledgements
This project is about having a ubiquitous representation of data
that having to do so many calculations with data: byte to gigabyte,
megabyte to terabyte and having representation to transfer data
among of time.

This is exactly the same idea o JSR-310 (date and time api) and
JSR-354 (money and currency api), providing a proper and right
way to calculate amount of data and data upon the time.

## Representations
Two diferent types of representations means diferent amount of
data. Currently, are ISO and Metric.


### ISO
| Value |  | IEC |  |
|---|---|---|---|
|1024 |	2<sup>10</sup> |	Ki |	kibi |
|1024<sup>2</sup> |	2<sup>20</sup> |	Mi |	mebi |
|1024<sup>3</sup> |	2<sup>30</sup> |	Gi |	gibi |
|1024<sup>4</sup> |	2<sup>40</sup> |	Ti |	tebi |
|1024<sup>5</sup> |	2<sup>50</sup> |	Pi |	pebi |
|1024<sup>6</sup> |	2<sup>60</sup> |	Ei |	exbi |
|1024<sup>7</sup> |	2<sup>70</sup> |	Zi |	zebi |
|1024<sup>8</sup> |	2<sup>80</sup> |	Yi |	yobi |

### Metric
| Value |  | SI |  |
|---|---|---|---|
|1000 |	10<sup>3</sup> |	k |	kilo |
|1000<sup>2</sup>| 	10<sup>6</sup>|	M |	mega  |
|1000<sup>3</sup>| 	10<sup>9</sup>|	G |	giga  |
|1000<sup>4</sup>| 	10<sup>12</sup> |	T |	tera  |
|1000<sup>5</sup>| 	10<sup>15</sup> |	P |	peta  |
|1000<sup>6</sup>| 	10<sup>18</sup> |	E |	exa   |
|1000<sup>7</sup>| 	10<sup>21</sup> |	Z |	zetta |
|1000<sup>8</sup>| 	10<sup>24</sup> |	Y |	yotta |