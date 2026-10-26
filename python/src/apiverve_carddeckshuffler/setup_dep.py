from setuptools import setup, find_packages

setup(
    name='apiverve_carddeckshuffler',
    version='1.2.3',
    packages=find_packages(),
    include_package_data=True,
    install_requires=[
        'requests',
        'setuptools'
    ],
    description='Card Deck Shuffler randomizes standard playing card decks using Fisher-Yates or riffle algorithms. Pass the deck count and optional jokers to get the full ordered cards with rank, suit, shorthand symbols, and the top card.',
    author='APIVerve',
    author_email='hello@apiverve.com',
    url='https://apiverve.com/marketplace/carddeckshuffler?utm_source=pypi&utm_medium=referral&utm_content=homepage',
    classifiers=[
        'Programming Language :: Python :: 3',
        'Operating System :: OS Independent',
    ],
    python_requires='>=3.6',
)
